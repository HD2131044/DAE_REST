/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dtos.AttendantDTO;
import dtos.EventDTO;
import ejbs.AttendantBean;
import ejbs.EventBean;
import exceptions.EntityDoesNotExistsException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

/**
 *
 * @author rmartin
 */
@Path("/events")
public class RESTServiceLayer {

    @EJB
    private EventBean eventBean;

    @EJB
    private AttendantBean attendantBean;

    @Context
    private SecurityContext securityContext;

    //UPDATE EVENT PRESENCE KEY
    @GET
    @RolesAllowed({"Attendant"})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("attendant_event_update_key")
    public String setPasswordOnEventOfAttendant(
            @QueryParam("event_id") Long event_id, @QueryParam("key") String key) {
        System.out.println("ivent id =" + event_id);
        System.out.println("key =" + key);
        String message ="";
        try {
            System.out.println("attendant name from rest : =" + securityContext.getUserPrincipal().getName());
            AttendantDTO att = attendantBean.getAttendant(securityContext.getUserPrincipal().getName());
            System.out.println("attendant ID =" + att.getId());
            message = eventBean.setPasswordOnEventOfAttendant(att.getId(), event_id, key);
            return message;
        } catch (EntityDoesNotExistsException ex) {
            Logger.getLogger(RESTServiceLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }

    
     //GET ATTENDANT LIST EVENTS 
    @GET
    @RolesAllowed({"Attendant"})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("attendant_events")
    public List<EventDTO> getAttendantEvents() {
        System.out.println("chegou pedido");
        List<EventDTO> events = null;
        try {
            AttendantDTO att = attendantBean.getAttendant(securityContext.getUserPrincipal().getName());
            System.out.println("attendant name from rest : =" + securityContext.getUserPrincipal().getName());
            events = eventBean.getAttendantEvents(att.getId());
        } catch (EntityDoesNotExistsException ex) {
            Logger.getLogger(RESTServiceLayer.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return events;
    }

}

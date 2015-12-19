/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.am.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

/**
 *
 * @author Tecnico
 */
public class Get_update_v_2 {

    public static void main(String[] args) {

        String baseUri = "http://localhost:8080/PresencesEnterprise_RESTWS/webapi";
        Client client = ClientBuilder.newClient();

        HttpAuthenticationFeature feature = null;
        feature = HttpAuthenticationFeature.basic("11", "111");
        client.register(feature);

        String resposta = "";
        try {
            //System.out.println("teste-2");
            resposta = client.target(baseUri)
                    .path("/events/attendant_event_update_key")
                    .queryParam("event_id", "23")
                    .queryParam("key", "tasacw222wo")
                    .request(MediaType.APPLICATION_XML)
                    .get(new GenericType<String>() {
                    });
            // System.out.println("teste-3");
            if (resposta == "") {
               // System.out.println("teste-4");
                // System.out.println("Nao efectuou a alteracaode presenca confirmada");
                // return;
            } else {
               // System.out.println("teste-5");
                //  System.out.println("Resposta ao pedido do Cliente: "+ resposta);
            }
        } catch (Exception e) {
            // System.out.println("teste-ERROR");
            System.err.println(e.getMessage());
        }

    }
}

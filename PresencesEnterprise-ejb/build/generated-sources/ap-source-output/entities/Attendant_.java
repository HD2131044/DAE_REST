package entities;

import entities.AttendantCategory;
import entities.Event;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-19T16:11:28")
@StaticMetamodel(Attendant.class)
public class Attendant_ extends User_ {

    public static volatile ListAttribute<Attendant, Event> eventParticipant;
    public static volatile ListAttribute<Attendant, AttendantCategory> categories;
    public static volatile ListAttribute<Attendant, Event> events;

}
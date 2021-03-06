package entities;

import entities.UserGroup.GROUP;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJBException;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@Table(name = "ATTENDANTS")
@NamedQueries({
    @NamedQuery(
            name = "getAllAttendants",
            query = "SELECT at FROM Attendant at ORDER BY at.id"
    )
})
public class Attendant extends User implements Serializable {

    /*
    @ManyToMany(mappedBy = "attendants")
    private List<Event> events;
     */
    @ManyToMany(mappedBy = "attendants")
    private List<AttendantCategory> categories;

    @ManyToMany(mappedBy = "attendants")
    private List<Event> events;

    @ManyToMany(mappedBy = "attendants")
    private List<Event> eventParticipant;

    public Attendant() {
        this.events = new LinkedList<>();
        this.categories = new LinkedList<>();
        this.eventParticipant = new LinkedList<>();
    }

    public Attendant(String username, String password, String name, String email) {
        super(username, password, name, email, GROUP.Attendant);

        this.events = new LinkedList<>();
        this.categories = new LinkedList<>();
        this.eventParticipant = new LinkedList<>();

    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<AttendantCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<AttendantCategory> categories) {
        this.categories = categories;
    }

    public void addEvent(Event event) {
        try {
            if (!events.contains(event)) {
                events.add(event);
            }
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    public void removeEvent(Event event) {
        try {
            if (events.contains(event)) {
                events.remove(event);
            }
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    public int getNumberOfEvents() {
        return this.events.size();
    }

    public void addCategory(AttendantCategory category) {
        try {
            if (!categories.contains(category)) {
                categories.add(category);
            }
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    public void removeCategory(AttendantCategory category) {
        try {
            if (categories.contains(category)) {
                categories.remove(category);
            }
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }

    public int getNumberOfCategories() {
        return this.categories.size();
    }

    public List<Event> getEventParticipant() {
        return eventParticipant;
    }

    public void setEventParticipant(List<Event> eventParticipant) {
        this.eventParticipant = eventParticipant;
    }

    @Override
    public String toString() {
        return "entities.Attendant[id=" + id + "]: " + name;
    }

}

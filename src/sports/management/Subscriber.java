package sports.management;

import java.util.ArrayList;

public class Subscriber {
    private String name;
    private String email;
    private ArrayList<Event> events;

    public Subscriber(String name, String email) {
        this.name = name;
        this.email = email;
        this.events = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void subscribeToEvent(Event event) {
        events.add(event);
    }

    public void unsubscribeFromEvent(Event event) {
        events.remove(event);
    }
    public void addSubscriber(Subscriber subscriber) {
        // Code to add subscriber to a database or collection
    }

    public void updateSubscriber(Subscriber subscriber) {
        // Code to update subscriber in a database or collection
    }

    public void deleteSubscriber(Subscriber subscriber) {
        // Code to delete subscriber from a database or collection
    }

}


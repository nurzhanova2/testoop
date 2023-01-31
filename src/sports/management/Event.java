package sports.management;


import java.util.ArrayList;
import java.util.Date;

public class Event {
    private String eventName;
    private Date eventDate;
    private String location;
    private ArrayList<Player> players;

    public Event(String eventName, Date eventDate, String location) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.location = location;
        this.players = new ArrayList<>();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }
    public void addEvent(Event event) {
        // Code to add event to a database or collection
    }

    public void updateEvent(Event event) {
        // Code to update event in a database or collection
    }

    public void deleteEvent(Event event) {
        // Code to delete event from a database or collection
    }

}

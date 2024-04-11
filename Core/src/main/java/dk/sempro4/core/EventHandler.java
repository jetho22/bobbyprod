package dk.sempro4.core;

public interface EventHandler <T extends Event> {
    void handleEvent(T event);
    void cancelEvent(T Event);
    boolean checkAvailabilty(T event);
    Event pickEvent();
    void decontructEvent();
}

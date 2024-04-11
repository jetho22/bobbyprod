package dk.sempro4.core;

public interface PersistenceHandler {

    int create(Event e);
    int read(Event e);
    int update(Event e);
    int delete(Event e);

}

package patternsjava.behavioral.mediator;

public interface Mediator {
    void send(String message, Colleague colleague);
}

package atm;

public interface Tray {
    void process(int amount) throws IllegalArgumentException;
    void setNext(Tray tray);
}

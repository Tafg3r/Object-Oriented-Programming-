import java.util.List;

public interface Observer {
    void handleEvent(List<Observer> observeredList);
}

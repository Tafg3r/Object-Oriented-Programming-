import java.util.ArrayList;
import java.util.List;

public class MessageNetwork implements Observed {
    List<Observer> groupsList = new ArrayList<>();

    @Override
    public void addObserver(Observer newGroup) {
        groupsList.add(newGroup);
        notifyObservers();
    }

    @Override
    public void removeObserver(Observer removedGroup) {
        groupsList.remove(removedGroup);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer group : groupsList) {
            System.out.println("Уведомление для всез групп!");
            group.handleEvent(groupsList);
        }
        System.out.println("_____________");
    }
}

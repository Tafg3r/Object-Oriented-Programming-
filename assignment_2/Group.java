import java.util.ArrayList;
import java.util.List;

public class Group implements Observed, Observer {
    //Поля класса
    private List<Observer> groupUsers = new ArrayList<>();
    private String name;

    public Group(String name) {
        this.name = name;
    }

    //Методы класса
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Группа: " + this.name + ". Участников: " + groupUsers.size();
    }

    //Observer
    //Уведомляем группу, что изменился состав группы.
    @Override
    public void handleEvent(List<Observer> currGroupsList) {
        System.out.println("Новый список всех групп: \n" + currGroupsList);
    }

    // Observersed
    // В данном случае, работа с юзерами user'ы
    @Override
    public void addObserver(Observer newUser) {
        groupUsers.add(newUser);
        notifyObservers();
    }

    @Override
    public void removeObserver(Observer removedUser) {
        groupUsers.remove(removedUser);
        notifyObservers();
    }

    // Уведомляем user'ов, что есть что-то в группе произошло
    @Override
    public void notifyObservers() {
        for (Observer curObserver: this.groupUsers) {
            System.out.println("Уведомление для группы " + this.name);
            curObserver.handleEvent(groupUsers);
        }
        System.out.println("______________");
    }
}

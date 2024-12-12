import java.util.List;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "юзер " + name;
    }

    @Override
    public void handleEvent(List<Observer> currGroupList) {
        System.out.println("Новый состав группы: " + currGroupList);
    }
}

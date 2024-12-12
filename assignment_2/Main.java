public class Main {
    public static void main(String[] args) {
        MessageNetwork VK = new MessageNetwork();

        // Добавляю группу
        Group alcoholics = new Group("Алкоголики");
        VK.addObserver(alcoholics);
        // В группу добавляю юзеров
        User petya = new User("Петя Пиво");
        User ivan = new User("Ваня Завод");
        alcoholics.addObserver(petya);
        alcoholics.addObserver(ivan);
        // Добавляю еще одну группу
        Group AITU = new Group("AITU GROUP");
        VK.addObserver(AITU);
        // Туда же петю
        AITU.addObserver(petya);
        // Удаляю петю из алгоголиков, потому что теперь он за зож
        alcoholics.removeObserver(petya);
        // Удаляю группу AITU, потому что распалась ((
        VK.removeObserver(AITU);
    }
}

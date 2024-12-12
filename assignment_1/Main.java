import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    private static void PrintData(Iterable<Person> persons) {
        for (Person p : persons) {
            String message = p.toString() + " earns " + Double.toString(p.getPaymentAmount());
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(
                new Employee("Arsen", "Malik", "somePosition", 27045.78F)
        );
        persons.add(
                new Employee("George", "Klunny", "somePosition", 50000.00F)
        );
        persons.add(
                new Student("Mr", "Bin", 2.34F)
        );
        persons.add(
                new Student("Pol", "Harley", 3.45F)
        );

        Collections.sort(persons);
        PrintData(persons);
    }
}

import java.util.Arrays;
import java.util.List;

class Hello{
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlotte", "Bronte", 45),
            new Person("Mather", "Arnold", 39)
        );

        persons.stream()
            .filter(p -> p.getLastName().startsWith("C"))
            .forEach(p -> System.out.println(p.getFirstName()));
    }
}
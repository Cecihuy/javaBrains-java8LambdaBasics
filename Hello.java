import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
 * 1. Sort list by last name
 * 2. Create a method that prints all elements in the list
 * 3. Create a method that prints all people that have last name beginning with C
 */
class Hello{
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlotte", "Bronte", 45),
            new Person("Mather", "Arnold", 39)
        );

        Collections.sort(persons, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        printConditionaly(persons, p -> true);

        System.out.println("spacer");

        printConditionaly(persons, p -> p.getFirstName().startsWith("C"));
    }

    private static void printConditionaly(List<Person> persons, Condition condition) {
        for(Person p:persons){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }

    interface Condition {
        boolean test(Person p);
    }
}
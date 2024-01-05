import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
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

        performConditionaly(persons, p -> true, p -> System.out.println(p));

        System.out.println("spacer");

        performConditionaly(persons, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p));        
    }

    private static void performConditionaly(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p:persons){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
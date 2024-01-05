import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Hello{
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlotte", "Bronte", 45),
            new Person("Mather", "Arnold", 39)
        );       
        //lambda version
        printConditionaly(persons, p -> true, p -> System.out.println(p));

        //method refference version
        printConditionaly(persons, p -> true, System.out::println);     //p -> method(p)
    }

    private static void printConditionaly(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p:persons){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
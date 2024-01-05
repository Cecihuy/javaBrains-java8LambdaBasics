import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }            
        });

        printAll(persons);

        System.out.println("spacer");
        
        printLastNameBeginWithC(persons);
    }

    private static void printLastNameBeginWithC(List<Person> persons) {
        for(Person p:persons){
            if(p.getLastName().startsWith("C")){
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> persons) {
        for(Person p:persons){
            System.out.println(p);
        }
    }
}
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
        System.out.println("using for loop");
        for(int i = 0; i < persons.size(); i++){
            System.out.println(persons);
        }
        System.out.println("using enhanced for loop");
        for(Person p:persons){
            System.out.println(p);
        }
        //with method forEach can possibly use thread
        System.out.println("using method forEach loop");
        persons.forEach(p -> System.out.println(p));

        System.out.println("using forEach loop writen with method reference");
        persons.forEach(System.out::println);
    }
}
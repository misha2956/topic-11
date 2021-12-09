package builder;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().age(18).friend("Hey").friend("You").height(199).name("Would").build();
        System.out.println(person);
    }
}

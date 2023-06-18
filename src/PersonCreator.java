public class PersonCreator {
    public static void main(String[] args) {
        Person person01 = new Person("James Peterson", 34, 180, 73.5);
        System.out.println("Person01 Details:");
        printPersonDetails(person01);

        // Calling growOlder method on James
        person01.growOlder();
        System.out.println("After calling growOlder:");
        System.out.println("Person01 Details:");
        printPersonDetails(person01);
    }

    public static void printPersonDetails(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Height: " + person.getHeight() + "cm");
        System.out.println("Weight: " + person.getWeight() + "lbs");
        System.out.println();
    }
}

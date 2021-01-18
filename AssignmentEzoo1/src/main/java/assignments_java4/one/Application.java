package assignments_java4.one;

public class Application {

    public static void main(String[] args) {

        Person p = new Person();
        p.setAge(23);
        p.setName("Jack");

        System.out.println("My name is " + p.getName() + " and I am " + p.getAge() + " years old");
    }

}

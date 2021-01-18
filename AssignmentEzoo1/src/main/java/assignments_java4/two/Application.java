package assignments_java4.two;

public class Application {

    public static void main(String[] args) {

        PrivatePerson p = new PrivatePerson();
        p.setAge(69);
        p.setName("Mark");

        System.out.println("My age is :" + p.getAge() + " and my name is " + p.getName());
    }
}

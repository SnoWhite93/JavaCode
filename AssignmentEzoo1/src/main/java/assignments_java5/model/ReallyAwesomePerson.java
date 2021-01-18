package assignments_java5.model;

public class ReallyAwesomePerson extends AwesomePerson {

    public ReallyAwesomePerson() {
        System.out.println("hello from really awesome person");
    }

    @Override
    public void talk() {

        System.out.println("My name is " + name + " my age is " + age + " and I am a really pula awesome person");

    }

}

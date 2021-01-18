package assignments_java5.model;

public class AwesomePerson extends Person {

    public AwesomePerson() {
        this.name = "Billy";
        this.age = 27;
        System.out.println("hello from pula de awesome person");
    }

    public void talk() {
        System.out.println("My name is " + name + " my age is " + age);
    }


}

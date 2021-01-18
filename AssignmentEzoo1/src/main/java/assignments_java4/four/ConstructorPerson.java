package assignments_java4.four;

public class ConstructorPerson {
    private String name;
    private int age;

    public ConstructorPerson() {
        this.name = "Miki Junior";
        this.age = -1;
    }

    @Override
    public String toString() {
        return "ConstructorPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

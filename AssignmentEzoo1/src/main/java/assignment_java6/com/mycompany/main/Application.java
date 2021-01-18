package assignment_java6.com.mycompany.main;

public class Application {

    public static void main(String[] args) {

        StaticClass.calculate(33.567f, 432432.55f);
        FinalClass finalClass = new FinalClass();
        System.out.println(finalClass.myConstant);

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.run();
    }
}

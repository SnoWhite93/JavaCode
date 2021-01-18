package assignments_java7.two;

public class MoverAndAnimate implements Animatable{



    @Override
    public void animate() {
        System.out.println("i animate");
    }

    @Override
    public void move() {
        System.out.println(" i move");
    }

}

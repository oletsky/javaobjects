package javatraining.oletsky.oop;

public class DemoDefaultMethods {
    public static void main(String[] args) {
        DefaultImplementer defImpl = new DefaultImplementer();
        defImpl.ordinaryFoo();
        defImpl.defaultFoo();


    }
}

interface DefaultInterface {

    default void defaultFoo() {
        System.out.println("Default message");
    }

    void ordinaryFoo();

}

class DefaultImplementer implements DefaultInterface {

    @Override
    public void ordinaryFoo() {
        System.out.println("Ordinary message");

    }

}

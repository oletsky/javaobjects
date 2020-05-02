package javatraining.oletsky.oop;

public class DemoDefaultInterface {
    public static void main(String[] args) {
        WithDefaults ekz = new DisObeyed();
        ekz.ordinaryFoo();
        ekz.defaultFoo1();
        ekz.defaultFoo2();
    }
}

interface WithDefaults {
    void ordinaryFoo();

    default void defaultFoo1() {
        System.out.println("This must be done!!");
    }

    default void defaultFoo2() {
        System.out.println("This should be done too");
    }
}

class DisObeyed implements WithDefaults {

    @Override
    public void ordinaryFoo() {
        System.out.println("A free realization");
    }

    @Override
    public void defaultFoo2() {
        System.out.println("Not necessary, actually");
    }
}



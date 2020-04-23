package javatraining.oletsky.oop;

public class DemoInterfaces {
    public static void main(String[] args) {
        Interf ekz = new Kl();
        ekz.method();
    }
}

interface Interf {
    void method();
}

class Kl implements Interf {

    @Override
    public void method() {
        System.out.println("Implemented method called");
    }
}

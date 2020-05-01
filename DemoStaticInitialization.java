package javatraining.oletsky.oop;

public class DemoStaticInitialization {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("javatraining.oletsky.oop.ClassWithStaticSection");
    }
}

class ClassWithStaticSection {
    static {
        System.out.println("Class loaded");
    }
}

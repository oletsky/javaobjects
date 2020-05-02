package javatraining.oletsky.oop;

public class DemoSimpleInheritance {
    public static void main(String[] args) {
        FirstSub sub = new FirstSub();
        sub.foo();

    }
}

class FirstBase {
    void foo() {
        System.out.println("Very important operation done");
    }

}

class FirstSub extends FirstBase {

}

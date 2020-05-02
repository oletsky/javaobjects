package javatraining.oletsky.oop;

public class ClassOrTypeOverloadTester {
    public static void main(String[] args) {
        Object o = "qwerty";
        new ClassOrTypeOverLoad().foo(o);
    }
}

class ClassOrTypeOverLoad {
    void foo(Object o ) {
        System.out.println("Object");
    }

    void foo(String o ) {
        System.out.println("String");
    }
}

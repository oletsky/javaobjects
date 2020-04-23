package javatraining.oletsky.oop;

public class OverloadChainTester {
    public static void main(String[] args) {
        var ekz = new OverloadChain();
        byte b = 5;
        ekz.foo(b); //short
    }
}

class OverloadChain {
    void foo(short a) {
        System.out.println("short");
    }

    void foo(int a) {
        System.out.println("long");
    }
}

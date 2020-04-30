package javatraining.oletsky.oop;

public class OtherConstructorCall {
    public static void main(String[] args) {
        OtherConstrCall c = new OtherConstrCall(10);
        c.foo();
    }
}

class OtherConstrCall{
    int n;

    OtherConstrCall() {
        System.out.println("Very important message");
    }

    OtherConstrCall(int n) {
        this();
        this.n=n;
    }

    void foo() {
        System.out.println("Important value is "+n);
    }
}

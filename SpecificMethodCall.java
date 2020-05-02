package javatraining.oletsky.oop;

public class SpecificMethodCall {
    public static void main(String[] args) {
        BaseKlass b = new SubKlass();
        ((SubKlass) b).other();
    }
}

class BaseKlass {
   void foo() {}
}

class SubKlass extends BaseKlass {
    void other() {
        System.out.println("Specific method called");
    }
}

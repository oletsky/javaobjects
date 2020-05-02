package javatraining.oletsky.oop;

public class ReturnCovariance {
    public static void main(String[] args) {
        var m = new Three().foo();
        System.out.println(m.getClass().getSimpleName());
    }
}

class One {
    public One foo() { return this; }
}

class Two extends One {
    @Override
    public One foo() { return this; }
}

class Three extends Two {
    @Override
    public One foo() { return this; }
}




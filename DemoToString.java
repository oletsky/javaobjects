package javatraining.oletsky.oop;

public class DemoToString {
    public static void main(String[] args) {
        WithToString ekz = new WithToString(10);
        System.out.println(ekz);
    }
}

class WithToString {
    int n;

    public WithToString(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "WithToString{" +
                "n=" + n +
                '}';
    }
}

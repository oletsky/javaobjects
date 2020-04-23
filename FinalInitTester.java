package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * Demonstration of initializating final fields in constructors
 */

public class FinalInitTester {
    public static void main(String[] args) {
        var ekz = new FinalInit();
        System.out.println(ekz.getN());
    }
}

class FinalInit {
    private final int n;

    FinalInit() {this.n = 10; }
    FinalInit(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
}


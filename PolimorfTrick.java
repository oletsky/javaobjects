package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * Illustrates the possible danger when a method of subclass
 * is being called from a constructor of superclass
 */

public class PolimorfTrick {
    public static void main(String[] args) {
        SubTrick v = new SubTrick();
    }
}

class SuperTrick {
    int a = 0;
    SuperTrick() {
        m();
    }
    public void m() {
        System.out.println(a);
    }
}

class SubTrick extends SuperTrick {
    int a = 10;
    public void m() {
        System.out.println("Value: " + a);
    }
}

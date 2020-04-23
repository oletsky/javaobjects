package javatraining.oletsky.oop;

/**
 * A typical mistake happening when
 * there is no default constructor in the superclass
 * Try to fix it
 */

public class TypicalChainMistake {
    public static void main(String[] args) {

    }
}

class SuperClassWrong {
    int n;

    public SuperClassWrong(int n) {
        this.n = n;
    }
}

class SubClassWrong extends SuperClassWrong{
    
}

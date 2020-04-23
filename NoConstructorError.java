package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * If any other constructor has been declared in a class
 * default constructor isn't provided
 */
public class NoConstructorError {
    public static void main(String[] args) {
        NoConstructor ekz = new NoConstructor(); //No default constructor
    }
}
class NoConstructor {
    int n;
    NoConstructor(int n) {
        this.n = n;
    }
}


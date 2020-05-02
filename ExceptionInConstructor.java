package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * Illustrating exceptions in constructor
 */
public class ExceptionInConstructor {
    public static void main(String[] args) {
        ExceptionClass ekz = new ExceptionClass(false);
        try {
             ekz = new ExceptionClass(true);
        }
        catch (Exception e) {
            System.out.println("Exception occured");
        }
        System.out.println(ekz);
    }
}

class ExceptionClass {
    public ExceptionClass(boolean flag) {
        if (flag) throw new RuntimeException();
    }
}

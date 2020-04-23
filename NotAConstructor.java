package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * Be cautious: the method Deviant in the class Deviant is NOT a constructor
 */
public class NotAConstructor {
    public static void main(String[] args) {
        Deviant Deviant = new Deviant(); //Constructor won't be called
        Deviant.Deviant(); //This is not a constructor call
    }

}

class Deviant {
    void Deviant() {
        System.out.println("You shouldn't do this");
    }
}

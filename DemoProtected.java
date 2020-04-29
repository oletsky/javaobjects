package javatraining.oletsky.protectedspeciality;

/**
 * @author O.Oletsky
 * Illustrating some features of protected access
 * This code works. But after removing the class SubClass to other package
 * it stops doing so. Why?
 */
public class DemoProtected {
    public static void main(String[] args) {
        SubClass ekz = new SubClass();
        ekz.foo();
    }
}

class SuperClass {
    protected void foo(){
        System.out.println("This method is protected!");
    }
}

class SubClass extends SuperClass {

}

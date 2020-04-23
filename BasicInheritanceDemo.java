package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * A simple example of inheritance
 */
public class BasicInheritanceDemo {
    public static void main(String[] args) {
        DerivedClass ekz = new DerivedClass();
        ekz.doSomething();
    }

}

class BaseClass {
    public void doSomething() {
        System.out.println("Something has been done");
    }
}

class DerivedClass extends BaseClass{

}

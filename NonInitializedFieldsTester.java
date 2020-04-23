package javatraining.oletsky.oop;

import org.w3c.dom.ls.LSOutput;

/**
 * @author O.Oletsky
 * Examples of initializing fields of a class
 */

public class NonInitializedFieldsTester {

    public static void main(String[] args) {
        NonInitClass ekz = new NonInitClass();
        System.out.println(ekz.i+5);
        //System.out.println(ekz.o+5); //NPE
        System.out.println(ekz.s);
        //System.out.println(ekz.s.length()); //NPE

    }
}

class NonInitClass {
    int i;
    Integer o;
    String s;
}

package javatraining.oletsky.oop;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * Illustrating some features of null
 */
public class DemoNull {
    public static void main(String[] args) {
        String wrongS;
        //System.out.println(wrongS); Non-initialized
        String s=null;
        System.out.println(s);
        System.out.println(s==null);
        System.out.println(s.length());
    }
}

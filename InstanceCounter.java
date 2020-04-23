package javatraining.oletsky.oop;

import java.util.ArrayList;

/**
 * A classical example of static fields and methods -
 * counting instances of a class
 */
public class InstanceCounter {
    public static void main(String[] args) {
        ArrayList<Counted> list = new ArrayList<>();
        list.add(new Counted());
        list.add(new Counted());
        list.add(new Counted());
        System.out.println("There is "+Counted.getCount()+" instances");
    }
}

class Counted {
    private static int count =0;

    public Counted() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

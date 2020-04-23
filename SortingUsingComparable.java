package javatraining.oletsky.oop;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author O.Oletsky
 * Demonstration of sorting a collection of a class
 * on the base of Comparable interface
 */
public class SortingUsingComparable {
    public static void main(String[] args) {
        ArrayList<MyClass> list = new ArrayList<>();
        list.add(new MyClass(10));
        list.add(new MyClass(30));
        list.add(new MyClass(15));
        list.add(new MyClass(5));
        list.add(new MyClass(25));
        Collections.sort(list);
        for (var c:list) {
            System.out.println(c);
        }

    }
}

class MyClass implements Comparable<MyClass> {
    private int n;

    public int getN() {
        return n;
    }

    public MyClass(int n) {
        this.n = n;
    }

    @Override
    public int compareTo(MyClass o) {
        return this.n-o.n;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "n=" + n +
                '}';
    }
}

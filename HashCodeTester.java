package javatraining.oletsky.oop;

import java.util.Objects;

/**
 * @author O.Oletsky
 * Demonstrates main features of hashCode()
 */
public class HashCodeTester {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1.hashCode()==o2.hashCode()); //false
        System.out.println("-------");
        Hashed h1 = new Hashed(1);
        Hashed h2 = new Hashed(1);
        System.out.println(h1.equals(h2)); //should be true
        System.out.println(Objects.equals(h1,h2));
        System.out.println(h1.hashCode()==h2.hashCode()); //should be true
    }
}

class Hashed {
    public Hashed(int n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashed hashed = (Hashed) o;
        return n == hashed.n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n);
    }

    int n;


}

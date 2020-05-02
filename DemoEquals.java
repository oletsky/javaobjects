package javatraining.oletsky.oop;

import java.util.Objects;

public class DemoEquals {
    public static void main(String[] args) {
        WithEquals o1 = new WithEquals(10);
        WithEquals o2 = new WithEquals(10);
        System.out.println(o1==o2); //false
        System.out.println(o1.equals(o2)); //depends
    }
}

class WithEquals {
    int n;

    public WithEquals(int n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WithEquals that = (WithEquals) o;
        return n == that.n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n);
    }
}

package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * Illustrating non-static initialization
 */
public class NonStaticAgainstDuplication {
    public static void main(String[] args) {
        var ekz1 = new DemoNonStatic();
        var ekz2 = new DemoNonStatic(10);
    }
}

class DemoNonStatic {
    int n;

    {
        System.out.println("Important operation done");
    }

    public DemoNonStatic() {
    }

    public DemoNonStatic(int n) {
        this.n = n;
    }
}

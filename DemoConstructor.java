package javatraining.oletsky.oop;

public class DemoConstructor {
    public static void main(String[] args) {
        Constr constr = new Constr();
    }

}

class Constr {
    int n;

    public Constr() {
        System.out.println(n);
        System.out.println("Constructor called");
    }
    
    public Constr(int n) {
        this.n = n;
    }
}

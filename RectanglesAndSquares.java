package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * This classical example demonstrates the fact that
 * even if IS_A takes place
 * there may not be a reason to inherit
 */

public class RectanglesAndSquares {
    public static void main(String[] args) {
        //Creating the square
        Square s = new Square(10);
        s.show();

        //Changing one side
        s.setA(20); // WAT?
        s.show();
        System.out.println("-------");

        //Creating the rectangle with equal sides;
        Rectangle r = new Rectangle(30,30);
        r.show();

    }
}

class Rectangle {
    protected int a;
    protected int b;

    public Rectangle() {

    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void show() {
        System.out.printf("This rectangle has sides %d and %d\n",a,b);
    }

}

class Square extends Rectangle {

    public Square(int a) {
        super(a, a);
    }

    public void show() {
        System.out.printf("This square has sides %d and %d\n",
                a,b);
    }
}

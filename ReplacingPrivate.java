package javatraining.oletsky.oop;

public class ReplacingPrivate {
    public static void main(String[] args) {
        SuperPrivate sb = new SubPrivate();
        sb.inform();

    }

}

class SuperPrivate {
    final private void inform() {
        System.out.println("Ku-ku!");
    }
}

class SubPrivate extends SuperPrivate {
    public void inform() {
        System.out.println("Das ist wirklich ku-ku");
    }
}

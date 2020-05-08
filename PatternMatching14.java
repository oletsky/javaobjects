package newfeatures;

public class PatternMatching14 {
    public static void main(String[] args) {
        BaseClass b = new SubClass();
        if (b instanceof SubClass bs) {
            bs.other();
        }
    }
}

class BaseClass {
    void foo() {
    }
}

class SubClass extends BaseClass {
    void other() {
        System.out.println("Specific method called");
    }
}


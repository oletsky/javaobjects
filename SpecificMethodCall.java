package newfeatures;

public class SpecificMethodCall {
    public static void main(String[] args) {
        BaseKlass b = new SubKlass();
        if (b instanceof SubKlass) {
            ((SubKlass) b).other();
        }
    }
}

class BaseKlass {
    void foo() {
    }
}

class SubKlass extends BaseKlass {
    void other() {
        System.out.println("Specific method called");
    }
}


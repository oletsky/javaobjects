package javatraining.oletsky.oop;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * Methods of classes should be made either abstract or final
 */

public class AbstractOrFinal {
    public static void main(String[] args) {
        ArrayList<BaseKl> list = new ArrayList<>();
        list.add(new BaseKl());
        list.add(new BaseKl());
        list.add(new SubKl());
        for (var l:list) {  l.foo();
        }
    }
}

class BaseKl{
    void foo() {
        System.out.println("VIP method");
    }
}

class SubKl extends BaseKl {
    @Override
    void foo() {
        System.out.println("Kvak!");
    }
}
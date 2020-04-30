package javatraining.oletsky.oop;

import java.util.ArrayList;

public class AddingThis {
    public static void main(String[] args) {
        ArrayList<ThisAdder> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            new ThisAdder().addThis(list);
        }
        System.out.println(list.size());
    }
}

class ThisAdder {
    public void addThis(ArrayList<ThisAdder> list) {
        if (list.size()<=2) list.add(this);
    }
}

package javatraining.oletsky.oop;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * Static methods are not polymorphic
 */

public class StaticsAreNotPolymorphic {
    public static void main(String[] args) {
        ArrayList<StaticAnimal> animals = new ArrayList<>();
        animals.add(new StaticFish());
        animals.add(new StaticBird());
        animals.add(new StaticMammal());
        animals.add(new StaticBird());
        animals.add(new StaticFish());

        for (StaticAnimal animal:animals) {
            animal.move();
        }
    }
}



class StaticAnimal {
    public static void move() {
        System.out.println("Animals may move in different ways");

    }
}

class StaticBird extends StaticAnimal {
    public static void move() {
        System.out.println("Bird flies");
    }
}

class StaticFish extends StaticAnimal {
    public static void move() {
        System.out.println("Fish swims");
    }
}

class StaticMammal extends StaticAnimal {

    public static void move() {
        System.out.println("Mammal goes and runs");
    }
}


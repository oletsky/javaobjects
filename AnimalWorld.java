package javatraining.oletsky.oop;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * Illustrating polymorhism
 * How can we refactor it?
 */

public class AnimalWorld {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Fish());
        animals.add(new Bird());
        animals.add(new Mammal());
        animals.add(new Bird());
        animals.add(new Fish());

        for (Animal animal:animals) {
            animal.move();
        }
    }
}

class Animal {
    public void move() {

    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Fish swims");
    }
}

class Mammal extends Animal {
    @Override
    public void move() {
        System.out.println("Mammal goes and runs");
    }
}

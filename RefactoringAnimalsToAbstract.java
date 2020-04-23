package javatraining.oletsky.oop;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * Illustrating polymorhism with abstract classes
 */

public class RefactoringAnimalsToAbstract {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        animals.add(new RealFish());
        animals.add(new RealBird());
        animals.add(new RealMammal());
        animals.add(new RealBird());
        animals.add(new RealFish());

        for (AbstractAnimal animal:animals) {
            animal.move();
        }
    }
}

abstract class AbstractAnimal {
    abstract public void move();
}

class RealBird extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}

class RealFish extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("Fish swims");
    }
}

class RealMammal extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("Mammal goes and runs");
    }
}
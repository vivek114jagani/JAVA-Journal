// Q6) Write a JAVA program to solve problem of multiple inheritance using Interface.

// Interface defining methods for walking and swimming
interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

// Class implementing Walkable interface
class Human implements Walkable {
    @Override
    public void walk() {
        System.out.println("Human is walking");
    }
}

// Class implementing Swimmable interface
class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

// Class combining behavior of both Walkable and Swimmable
class Duck implements Walkable, Swimmable {
    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Human human = new Human();
        human.walk();

        Fish fish = new Fish();
        fish.swim();

        Duck duck = new Duck();
        duck.walk();
        duck.swim();
    }
}

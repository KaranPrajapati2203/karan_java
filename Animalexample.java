package functionOverride;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Animalexample {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 2);
        Cat cat = new Cat("Shizume", 6);

        dog.makeSound(); 
        cat.makeSound(); 
    }
}

package OOPS;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void eat() {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void eat() {
        System.out.println("Dog eats bones");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal.sound();
        dog.sound();
        dog.eat();
        cat.sound();
    }
}

package OOPS;
abstract class Animal {
    abstract void sound();
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
public class AbstractExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eat();
    }
}

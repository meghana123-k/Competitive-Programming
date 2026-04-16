package OOPS;
interface Animal {
    void eat();
}
interface Mammal {
    void drink();
}
class Dog implements Animal, Mammal {
    public void eat() {
        System.out.println("Dog eats bones");
    }
    public void drink() {
        System.out.println("Dog drinks water");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.drink();
    }
}

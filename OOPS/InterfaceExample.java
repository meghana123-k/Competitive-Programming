package OOPS;
interface Shape {
    // by default, all methods in an interface are abstract and public
    double pi = 3.14; // by default, all variables in an interface are public, static and final
    void getArea();
    void getPerimeter();
}
class Circle implements Shape {
    public void getArea() {
        System.out.println(pi);
    }
    public void getPerimeter() {
        System.out.println("hi");
    }
}   
public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getArea();
        circle.getPerimeter();
    }
}

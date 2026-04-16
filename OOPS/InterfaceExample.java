package OOPS;
interface Shape {
    // by default, all methods in an interface are abstract and public
    void getArea();
    void getPerimeter();
}
class Circle implements Shape {
    public void getArea() {
        System.out.println(45);
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

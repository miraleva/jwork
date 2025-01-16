package sınav;

abstract class Shape {
    public abstract void calculateArea();
}

class Circle extends Shape {
    public void calculateArea() {
        System.out.println("Circle rea");
    }
}

class Rectangle extends Shape {
    public void calculateArea() {
        System.out.println("Rectangle area");
    }
}

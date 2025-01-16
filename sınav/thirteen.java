package sınav;

interface Drivable {
    void drive();
}

interface Flyable {
    void fly();
}

class FlyingCar implements Drivable, Flyable {
    public void drive() {
        System.out.println("Driving");
    }

    public void fly() {
        System.out.println("Flying");
    }
}


package sınav;

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("araba çalışıyo");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("bisiklet çalışıyo");
    }
}

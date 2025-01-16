package sınav;

abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    public void sound() {
        System.out.println("havlıyorum");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Miyav");
    }
}

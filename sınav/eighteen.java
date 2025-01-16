package sınav;

interface Calculator {
    void calculate();
}

class Adder implements Calculator {
    public void calculate() {
        System.out.println("Adding");
    }
}

class Multiplier implements Calculator {
    public void calculate() {
        System.out.println("Multiplying");
    }
}

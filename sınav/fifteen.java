package sınav;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionDevice implements Printer, Scanner {
    public void print() {
        System.out.println("Printing");
    }

    public void scan() {
        System.out.println("Scanning");
    }
}

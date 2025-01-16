package sınav;

interface Payment {
    void process();
}

class CreditCard implements Payment {
    public void process() {
        System.out.println("Credit card processed");
    }
}

class PayPal implements Payment {
    public void process() {
        System.out.println("PayPal card processed");
    }
}

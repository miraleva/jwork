package sınav;

interface Bird {
    void fly();
    void sing();
}

interface Eagle extends Bird {
    void hunt();
}

class GoldenEagle implements Eagle {
    public void fly() {
        System.out.println("Flying");
    }

    public void sing() {
        System.out.println("Singing");
    }

    public void hunt() {
        System.out.println("Hunting");
    }
}

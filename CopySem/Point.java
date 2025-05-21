package CopySem;

class Point {
    int x;

    Point(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(10);
        Point p2 = p1; // referans kopyalanır, nesne değil!
        p2.x = 20;

        System.out.println("p1.x = " + p1.x); // 20 olur, çünkü p1 ve p2 aynı nesneyi gösteriyor
        System.out.println("p2.x = " + p2.x); // 20
    }
}


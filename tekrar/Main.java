package tekrar;

public class Main{

    public static void Main(String args[]) {
        int a = 8;
        int b = 6;

        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("Toplam: " + (a + b));
            } else if (i == 2) {
                System.out.println("Fark: " + (a - b));
            } else if (i == 3) {
                System.out.println("Çarpım: " + (a * b));
            } else if (i == 4) {
                System.out.println("Bölüm: " + (a / b));
            } else if (i == 5) {
                System.out.println("Kalan: " + (a % b));
            }
        }
    }
}

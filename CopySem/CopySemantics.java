package CopySem;

public class CopySemantics {
    public static void main(String[] args) {
        // PRIMITIVE TYPE (int)
        int a = 10;
        int b = a; // a'nın değeri b'ye KOPYALANIR
        b = 20;
        System.out.println("Primitive Types:");
        System.out.println("a = " + a); // a hâlâ 10
        System.out.println("b = " + b); // b artık 20

        // REFERENCE TYPE (array)
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // arr1'in REFERANSI arr2'ye atanır
        arr2[0] = 99;
        System.out.println("\nReference Types:");
        System.out.println("arr1[0] = " + arr1[0]); // 99, çünkü aynı nesneyi işaret ediyorlar
        System.out.println("arr2[0] = " + arr2[0]); // 99

        // DEEP COPY örneği (array klonlama)
        int[] arr3 = arr1.clone(); // yeni bir kopya oluşturuluyor
        arr3[0] = 123;
        System.out.println("\nDeep Copy:");
        System.out.println("arr1[0] = " + arr1[0]); // 99
       System.out.println("arr3[0] = " + arr3[0]); // 123
    }
}
public class fib {
  static  public int fac(int n){

        if(n==1){
            return 1;
        }

        return fac(n-1)*n;
        
            
    }

    public static void main(String[] args) {
        
        System.out.println(fac(5));
        System.out.println(fibo(0));
        System.out.println(fibo(1));
        System.out.println(fibo(2));
        System.out.println(fibo(3));
        System.out.println(fibo(4));
    }
    public static int fibo(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibo(n-2)+fibo(n-1);
    
    }
}
 

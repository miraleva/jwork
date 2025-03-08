

public class kutu{
    String kıyafet;
    
    public kutu(String k){
        this.kıyafet = k;

    }

    public void show(){
        System.out.println(this.kıyafet);
    }

    public static void main(String[] args) {
        kutu kutu = new kutu("elbise");
        kutu kutu1 = new kutu("pant");

        kamyon kamyon= new kamyon();
        kamyon.add(kutu);
        kamyon.adding(kutu1);
        kamyon.listele();
        
    }

}

class kamyon{
    kutu[] depo = new kutu[2];

    public void add(kutu bişi){
        depo[0]= bişi;

    }
    public void adding(kutu bişi){
        depo[1]= bişi;

    }

    public void listele(){
        for(int i=0; i<2; i++){
            this.depo[i].show();
        }
    }
}


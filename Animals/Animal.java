package Animals;

public class Animal{

    String name;
    
    Animal(String name){
        this.name=name;

    }

    public void makeSound(){
        System.out.println(name + "makes sound be aware...");
    }
    
    class Dog extends Animal {
        Dog(String name){
            super(name);
        }
        @Override
        public void makeSound(){
            System.out.println(name + "Barks");
        }


    }

    class Cat extends Animal {
        Cat(String name){
            super(name);
        }
        @Override
        public void makeSound(){
            System.out.println(name + "meoww");
        }


    }


}



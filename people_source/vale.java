package people_source;

public class vale extends Employee { 
    public Valet(String name, int age, String task) {
        super(name, age, task); 
    }

    public void parkCar() {
        System.out.println(getName() + "aracınızı park ediyo"); 
    }
}

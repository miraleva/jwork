package people_source;

public class tourist extends humanB {
    private String roomNumber;

    public tourist(String name, int age, String roomNumber) {
        super(name, age); 
        this.roomNumber = roomNumber; 
    }

    public String getRoomNumber() {
        return this.roomNumber; 
    }
}

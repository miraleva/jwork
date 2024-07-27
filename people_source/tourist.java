package people_source;

public class Tourist extends humanB {
    private String roomNumber;

    public Tourist(String name, int age, String roomNumber) {
        super(name, age); 
        this.roomNumber = roomNumber; 
    }

    public String getRoomNumber() {
        return this.roomNumber; 
    }
}

package people_source;

public class Tourist extends humanB {
    private String roomNumber; // Turistin kaldığı oda numarası

    public Tourist(String name, int age, String roomNumber) {
        super(name, age); // Üst sınıfın yapıcısını çağırarak ad ve yaş bilgilerini başlatır.
        this.roomNumber = roomNumber; // Oda numarasını başlatır.
    }

    public String getRoomNumber() {
        return this.roomNumber; // Oda numarasını döndürür.
    }
}

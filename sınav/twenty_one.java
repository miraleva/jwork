package sınav;

interface VehicleInterface {
    void startEngine();
    void stopEngine();
    void fuelStatus();
}

class Car implements VehicleInterface {
    public void startEngine() {
        System.out.println("Engine başlatıldı");
    }

    public void stopEngine() {
        System.out.println("Engine durdu");
    }

    public void fuelStatus() {
        System.out.println("Fuel dolu");
    }
}


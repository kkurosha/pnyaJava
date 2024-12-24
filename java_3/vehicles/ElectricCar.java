package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    public int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName,
                       String insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        this.setEngineType(("Electric"));
    }

    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }
    public int getBatteryCapacity() { return batteryCapacity; }

    @Override //переопределяем метод из базового класса
    public String vehicleType() { return "Electric Car"; }

    @Override
    public String toString() {
        return super.toString() + "\nBattery Capacity: " + this.batteryCapacity + " kWh";
    }
}

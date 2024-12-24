package vehicles;

public abstract class Vehicle {
    private String model, license, color, ownerName, insuranceNumber;
    private int year;
    protected String engineType;

    public Vehicle(String model, String license, String color, int year,
                   String ownerName, String insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    public abstract String vehicleType();

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getLicense() { return license; }
    public void setLicense(String license) { this.license = license; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public String getEngineType() { return engineType; }
    public void setEngineType(String value) { this.engineType = value; }

    public String toString() {
        return "Model: " + this.getModel() + "\nlicense: " + this.getLicense() + "\ncolor: " + this.getColor() + "\nyear: " + this.getYear() +
            "\nowner name: " + this.getOwnerName() + "\ninsurance number: " + this.getInsuranceNumber() +
            "\nengine type: " + this.getEngineType();
    }
}

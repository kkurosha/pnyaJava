package app;
import vehicles.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Car1", "AAA888", "White", 2012,
                "Arina", "123456");
        ElectricCar elCar = new ElectricCar("ElCar", "BBB123", "Black", 2019,
                "Kirill", "98765", 78);
        car1.setYear(2000);
        car1.setOwnerName("Fedya");
        car1.setInsuranceNumber("555000");
        elCar.setYear(2005);
        elCar.setOwnerName("Arina");
        elCar.setInsuranceNumber("90897");
        System.out.println(car1);
        System.out.println("\n" + elCar + "\n");
        System.out.println("Емкость батареи у электромобиля: " + elCar.getBatteryCapacity());
    }
}

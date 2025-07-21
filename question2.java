// 1. Interface with abstract method, constant, default, and static methods
interface Vehicle {
    // 1. Abstract method
    void drive();

    // 2. Constant (implicitly public, static, and final)
    int MAX_SPEED = 180;

    // 3. Default method
    default void fuelType() {
        System.out.println("Uses petrol or diesel.");
    }

    // 4. Static method
    static void generalInfo() {
        System.out.println("Vehicles are used for transportation.");
    }
}

// 5. Another interface to demonstrate multiple inheritance
interface Electric {
    void chargeBattery();
}

// Implementing both interfaces
class ElectricCar implements Vehicle, Electric {
    public void drive() {
        System.out.println("Electric car is driving silently...");
    }

    public void chargeBattery() {
        System.out.println("Charging electric car battery...");
    }
}

// Main class
public class question2 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();

        System.out.println("Implemented by: Khusboo Karki\n");

        tesla.drive();                        // Abstract method
        tesla.chargeBattery();                // Multiple inheritance
        tesla.fuelType();                     // Default method
        Vehicle.generalInfo();                // Static method
        System.out.println("Max Speed: " + Vehicle.MAX_SPEED + " km/h");  // Constant
    }
}

// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

// Child class 1
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Child class 2
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // inherited from Vehicle
        car.drive(); // defined in Car

        Bike bike = new Bike();
        bike.start(); // inherited from Vehicle
        bike.ride();  // defined in Bike
    }
}
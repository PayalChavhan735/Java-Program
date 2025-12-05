package Abstraction;

abstract class Vehicle {
    int no;
    String model;
    String colour;
    int average;
    static int count;

    public Vehicle() {
        no = 1000;
        model = "Tesla";
        colour = "Black";
        average = 400;
        count++;
    }

    public Vehicle(int no, String model, String colour, int average) {
        this.no = no;
        this.model = model;
        this.colour = colour;
        this.average = average;
        count++;
    }

    abstract void display();   // ABSTRACT METHOD
}

// ------------------ CAR CLASS -------------------------
class Car extends Vehicle {
    int noOfDoors;
    String airConditioner;
    String musicSystem;

    Car() {
        super();
        noOfDoors = 4;
        airConditioner = "AC";
        musicSystem = "Sony";
    }

    Car(int no, String model, String colour, int average, int noOfDoors,
        String airConditioner, String musicSystem) {

        super(no, model, colour, average);
        this.noOfDoors = noOfDoors;
        this.airConditioner = airConditioner;
        this.musicSystem = musicSystem;
    }

    @Override
    void display() {
        System.out.println("----- CAR DETAILS -----");
        System.out.println("Number: " + no);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Average: " + average);
        System.out.println("Doors: " + noOfDoors);
        System.out.println("AC: " + airConditioner);
        System.out.println("Music System: " + musicSystem);
    }
}

// ------------------ BIKE CLASS -------------------------
class Bike extends Vehicle {
    int gear;
    int mileage;

    Bike() {
        super();
        gear = 4;
        mileage = 60;
    }

    Bike(int no, String model, String colour, int average, int gear, int mileage) {
        super(no, model, colour, average);
        this.gear = gear;
        this.mileage = mileage;
    }

    @Override
    void display() {
        System.out.println("----- BIKE DETAILS -----");
        System.out.println("Number: " + no);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Average: " + average);
        System.out.println("Gear: " + gear);
        System.out.println("Mileage: " + mileage);
    }
}

// ------------------ CYCLE CLASS -------------------------
class Cycle extends Vehicle {
    String brand;
    int gears;

    Cycle() {
        super();
        brand = "Hero";
        gears = 6;
    }

    Cycle(int no, String model, String colour, int average, String brand, int gears) {
        super(no, model, colour, average);
        this.brand = brand;
        this.gears = gears;
    }

    @Override
    void display() {
        System.out.println("----- CYCLE DETAILS -----");
        System.out.println("Number: " + no);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Average: " + average);
        System.out.println("Brand: " + brand);
        System.out.println("Gears: " + gears);
    }
}

// ------------------ MAIN CLASS -------------------------
class TestVehicles {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car(1111, "Swift", "White", 22, 4, "AC", "Sony");
        v.display();

        v = new Bike(2222, "Splendor", "Red", 60, 4, 70);
        v.display();

        v = new Cycle(3333, "Atlas", "Blue", 0, "Atlas Gold", 6);
        v.display();

        System.out.println("\nTotal Vehicle Count: " + Vehicle.count);
    }
}

package ToString;

class Vehical1 {
	int no;
    String model;
    String colour;
    int average;
    static int count;

     Vehical1() {
        no = 1000;
        model = "Tesla";
        colour = "Black";
        average = 400;
        count++;
    }

      Vehical1(int no, String model, String colour, int average) {
        this.no = no;
        this.model = model;
        this.colour = colour;
        this.average = average;
        count++;
    }

	@Override
	public String toString() {
		return "Vehical1 [no=" + no + ", model=" + model + ", colour=" + colour + ", average=" + average + "]";
	}

 
}

// ------------------ CAR CLASS -------------------------
class Car1 extends Vehical1 {
    int noOfDoors;
    String airConditioner;
    String musicSystem;

    Car1() {
        super();
        noOfDoors = 4;
        airConditioner = "AC";
        musicSystem = "Sony";
    }

    Car1(int no, String model, String colour, int average, int noOfDoors,
        String airConditioner, String musicSystem) {

        super(no, model, colour, average);
        this.noOfDoors = noOfDoors;
        this.airConditioner = airConditioner;
        this.musicSystem = musicSystem;
    }

	@Override
	public String toString() {
		return super.toString()+"Car [noOfDoors=" + noOfDoors + ", airConditioner=" + airConditioner + ", musicSystem=" + musicSystem
				+ "]";
	}

    
    }


// ------------------ BIKE CLASS -------------------------
class Bike1 extends Vehical1 {
    int gear;
    int mileage;

    Bike1() {
        super();
        gear = 4;
        mileage = 60;
    }

    Bike1(int no, String model, String colour, int average, int gear, int mileage) {
        super(no, model, colour, average);
        this.gear = gear;
        this.mileage = mileage;
    }

	@Override
	public String toString() {
		return super.toString()+"Bike [gear=" + gear + ", mileage=" + mileage + "]";
	}

    
    }


// ------------------ CYCLE CLASS -------------------------
class Cycle2 extends Vehical1 {
    String brand;
    int gears;

    Cycle2() {
        super();
        brand = "Hero";
        gears = 6;
    }

    Cycle2(int no, String model, String colour, int average, String brand, int gears) {
        super(no, model, colour, average);
        this.brand = brand;
        this.gears = gears;
    }

	@Override
	public String toString() {
		return super.toString()+"Cycle [brand=" + brand + ", gears=" + gears + "]";
	}

    
    }


// ------------------ MAIN CLASS -------------------------
class ToStringVehical {
    public static void main(String[] args) {

    	Vehical1 v1=new Vehical1();
		v1=new Car1(1234,"Maruti Suzuki","White",22,6,"Ac","Vxi");
		System.out.println(v1);
		System.out.println();
		
		v1=new Bike1(1122,"Hero Splender","Black",70,80,4);
		System.out.println(v1);
		System.out.println();
		
		v1=new Cycle2();
		System.out.println(v1);
		System.out.println();
		
		
}
}

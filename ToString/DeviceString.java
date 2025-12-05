package ToString;

public class DeviceString {
	String Brand;
	String Model;
	int price;
	int batterylevel;
	static int count;
	
	DeviceString() {
		Brand = "Apple";
		Model = "iPhone17";
		price = 500000;
		batterylevel = 100;
		count++;
	}

	public DeviceString(String brand, String model, int price, int batterylevel) {
		super();
		Brand = brand;
		Model = model;
		this.price = price;
		this.batterylevel = batterylevel;
	}

	@Override
	public String toString() {
		return "DeviceString [Brand=" + Brand + ", Model=" + Model + ", price=" + price + ", batterylevel="
				+ batterylevel + "]";
	}	

}

class Mobile extends DeviceString {
	int simsloats;
	int cameraMP;
	int Storage;
	String is5G;

Mobile() {
	super();
	simsloats = 2;
	cameraMP = 50;
	Storage = 128;
	is5G = "yes";
}

public Mobile(String brand, String model, int price, int batterylevel) {
	super(brand, model, price, batterylevel);
	this.simsloats = simsloats;
	this.cameraMP = cameraMP;
	this.Storage = Storage;
	this.is5G = is5G;
}

@Override
public String toString() {
	return super.toString()+"\nMobile [simsloats=" + simsloats + ", cameraMP=" + cameraMP + ", Storage=" + Storage + ", is5G=" + is5G
			+ "]";
}

}
class Laptop extends DeviceString {
	int ramsize;
	String processor;
	String OperatingSystem;
	
	Laptop() {
		ramsize = 64;
		processor = "Ryzen";
		OperatingSystem = "Windows";
	}

	 Laptop(String brand, String model, int price, int batterylevel) {
		super(brand, model, price, batterylevel);
		this.ramsize = ramsize;
		this.processor = processor;
		this.OperatingSystem = OperatingSystem;
	}

	@Override
	public String toString() {
		return "Laptop [ramsize=" + ramsize + ", processor=" + processor + ", OperatingSystem=" + OperatingSystem + "]";
	}	
	
}

class SmartWatch extends DeviceString {
	int HeartRate;
	int setpcount;
	
	SmartWatch() {
		HeartRate = 90;
		setpcount = 10000;
	}
	
	
	
public SmartWatch(String brand, String model, int price, int batterylevel) {
		super(brand, model, price, batterylevel);
	this.HeartRate = HeartRate;
	this.setpcount = setpcount;
}
@Override
public String toString() {
	return "SmartWatch [HeartRate=" + HeartRate + ", setpcount=" + setpcount + "]";
}




class DeviceString1 {
	public static void main(String[]args) {
		DeviceString ds=new DeviceString();
		ds=new Mobile();
		System.out.println(ds);
		System.out.println();
		
		ds=new Laptop();
		System.out.println(ds);
		System.out.println();
		
		ds=new SmartWatch();
		System.out.println(ds);
		System.out.println();
	}
		
	}	
}
		

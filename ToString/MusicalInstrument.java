package ToString;

public class MusicalInstrument {
	String InstrumentName;
	String brand;
	int price;
	
	MusicalInstrument(){
		InstrumentName="MusicalInstrument";
		brand="Casio";
		price=3000;
}

	public MusicalInstrument(String instrumentName, String brand, int price) {
		super();
		InstrumentName = instrumentName;
		this.brand = brand;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "MusicalInstrument [InstrumentName=" + InstrumentName + ", brand=" + brand + ", price=" + price + "]";
	}
	
	}
class Guitor extends MusicalInstrument{
	int Stringcount;
	
	Guitor(){
		Stringcount=4;	
	}

	public Guitor(String instrumentName, String brand, int price) {
		super(instrumentName, brand, price);
		Stringcount = Stringcount;
	}

	@Override
	public String toString() {
		return super.toString()+"\nGuitor [Stringcount=" + Stringcount + "]";
	}
		
}
class Piano extends MusicalInstrument{
	int keycount;
	
	Piano(){
		keycount=6;
	}

	public Piano(String instrumentName, String brand, int price) {
		super(instrumentName, brand, price);
		this.keycount = keycount;
	}

	@Override
	public String toString() {
		return "Piano [keycount=" + keycount + "]";
	}
		
}
class Drum extends MusicalInstrument{
	int drumsize;
	
	Drum(){
		drumsize=60;
	}

	@Override
	public String toString() {
		return "Drum [drumsize=" + drumsize + "]";
	}

	public Drum(String instrumentName, String brand, int price) {
		super(instrumentName, brand, price);
		this.drumsize = drumsize;
	}
		
}
class MusicalInstrumentString{
	public static void main(String[]args) {
		MusicalInstrument m=new MusicalInstrument();
		m=new Guitor();
		System.out.println(m);
		System.out.println();
		
		m=new Piano();
		System.out.println(m);
		System.out.println();
		
		m=new Drum();
		System.out.println(m);
		System.out.println();
		
		
		
	}
}


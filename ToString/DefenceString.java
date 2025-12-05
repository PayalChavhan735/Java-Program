package ToString;

public class DefenceString {
	String nameofHead;
	 int noofVehicle;
	 int budget;
	 int noofdept;
	 int noofmission;
	 
	 DefenceString(){
			nameofHead="piuu";
			noofVehicle=20;
			budget=100000;
			noofdept=5;
			noofmission=5000;		
	 }

	public DefenceString(String nameofHead, int noofVehicle, int budget, int noofdept, int noofmission) {
		super();
		this.nameofHead = nameofHead;
		this.noofVehicle = noofVehicle;
		this.budget = budget;
		this.noofdept = noofdept;
		this.noofmission = noofmission;
	}

	@Override
	public String toString() {
		return  "DefenceString [nameofHead=" + nameofHead + ", noofVehicle=" + noofVehicle + ", budget=" + budget
				+ ", noofdept=" + noofdept + ", noofmission=" + noofmission + "]";
	}
	
}
class Navy extends DefenceString{
	 int noofship;
	 int submarine;
	 int nooftorpedoes;
	 
	 Navy(){
			noofship=10000;
			submarine=500;
			nooftorpedoes=800;
	 }
	public Navy(String nameofHead, int noofVehicle, int budget, int noofdept, int noofmission) {
		super(nameofHead, noofVehicle, budget, noofdept, noofmission);	
		this.noofship = noofship;
		this.submarine = submarine;
		this.nooftorpedoes = nooftorpedoes;
	}
	@Override
	public String toString() {
		return super.toString()+"\nNavy [noofship=" + noofship + ", submarine=" + submarine + ", nooftorpedoes=" + nooftorpedoes + "]";
	}
	
}
class Air extends DefenceString{
	 int noofmission;
	 int noofAircraft;
	 int noofSquadron;
	 
	 Air(){
			noofmission=700;
			noofAircraft=8000;
			noofSquadron=500;
	 }
	public Air(String nameofHead, int noofVehicle, int budget, int noofdept, int noofmission) {
		super(nameofHead, noofVehicle, budget, noofdept, noofmission);
		this.noofmission = noofmission;
		this.noofAircraft = noofAircraft;
		this.noofSquadron = noofSquadron;
	}
	@Override
	public String toString() {
		return "Air [noofmission=" + noofmission + ", noofAircraft=" + noofAircraft + ", noofSquadron=" + noofSquadron
				+ "]";
	}
	
}
class Army extends DefenceString{
	 int noofGuns;
	 int noofGuards;
	 int moofbattalion;
	 
	 Army(){
			noofGuns=10000;
			noofGuards=500;
			moofbattalion=200;	
	 }

	public Army(String nameofHead, int noofVehicle, int budget, int noofdept, int noofmission) {
		super(nameofHead, noofVehicle, budget, noofdept, noofmission);
		this.noofGuns = noofGuns;
		this.noofGuards = noofGuards;
		this.moofbattalion = moofbattalion;
	}

	@Override
	public String toString() {
		return "Army [noofGuns=" + noofGuns + ", noofGuards=" + noofGuards + ", moofbattalion=" + moofbattalion + "]";
	}	 
}
class DefenceString1 {
	public static void main(String[]args) {
		DefenceString ds=new DefenceString();
		ds=new Navy();
		System.out.println(ds);
		System.out.println();
		
		ds=new Air();
		System.out.println(ds);
		System.out.println();
		
		ds=new Army();
		System.out.println(ds);
		System.out.println();
	}
}


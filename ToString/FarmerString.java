package ToString;

public class FarmerString {
	 int farmerId;
	 String farmername;
	 int area;
	 int annualincome;
	 int noofequipment;
	 
	 FarmerString(){
		 farmerId=202;
			farmername="ramu";
			area=1000;
			annualincome=50000;
			noofequipment=45;	 
	 }

	public FarmerString(int farmerId, String farmername, int area, int annualincome, int noofequipment) {
		super();
		this.farmerId = farmerId;
		this.farmername = farmername;
		this.area = area;
		this.annualincome = annualincome;
		this.noofequipment = noofequipment;
	}

	@Override
	public String toString() {
		return "FarmerString [farmerId=" + farmerId + ", farmername=" + farmername + ", area=" + area
				+ ", annualincome=" + annualincome + ", noofequipment=" + noofequipment + "]";
	}
}
	 class Diaryfarmer extends FarmerString{
		 int noofcattles;
		 int milkproductionrate;
		 int diarylicenseno;
	 
		 Diaryfarmer(){
				noofcattles=400;
				milkproductionrate=50;
				diarylicenseno=112;
		 
	 }
		public Diaryfarmer(int farmerId, String farmername, int area, int annualincome, int noofequipment) {
			super(farmerId, farmername, area, annualincome, noofequipment);
			this.noofcattles = noofcattles;
			this.milkproductionrate = milkproductionrate;
			this.diarylicenseno = diarylicenseno;
		}
	 
		@Override
		public String toString() {
			return super.toString()+"\nDiaryfarmer [noofcattles=" + noofcattles + ", milkproductionrate=" + milkproductionrate
					+ ", diarylicenseno=" + diarylicenseno + "]";
		}
	 }
	 
	 class Polatryfarmer extends FarmerString{
		 int noofchiken;
		 int noofshades;
		 int eggproduction;
		 String poultryfarmername;
		 
		

		Polatryfarmer(){
				noofchiken=400;
				noofshades=5;
				eggproduction=700;
				poultryfarmername="Suguna Foods";
		}
		public Polatryfarmer(int farmerId, String farmername, int area, int annualincome, int noofequipment) {
			super(farmerId, farmername, area, annualincome, noofequipment);
			this.noofchiken = noofchiken;
			this.noofshades = noofshades;
			this.eggproduction = eggproduction;
			this.poultryfarmername = poultryfarmername;
		}
		@Override
		public String toString() {
			return  "Polatryfarmer [noofchiken=" + noofchiken + ", noofshades=" + noofshades + ", eggproduction="
					+ eggproduction + ", poultryfarmername=" + poultryfarmername + "]";
		}
		
		 
	 }
	 class Organicfarmer extends FarmerString{
		 int organicId;
		 String cropType;
		 String Fertilizerused;
		 
		 Organicfarmer(){
				organicId=1234;
				cropType="wheat";
				Fertilizerused="urea";			
				
}

		public Organicfarmer(int farmerId, String farmername, int area, int annualincome, int noofequipment) {
			super(farmerId, farmername, area, annualincome, noofequipment);
			this.organicId = organicId;
			this.cropType = cropType;
			Fertilizerused = Fertilizerused;
		}

		@Override
		public String toString() {
			return "Organicfarmer [organicId=" + organicId + ", cropType=" + cropType + ", Fertilizerused="
					+ Fertilizerused + "]";
		}
	 }
		class FarmerString1 {
			public static void main(String[]args) {
				FarmerString fs=new FarmerString();
				fs=new Diaryfarmer();
				System.out.println(fs);
				System.out.println();
				
				fs=new Polatryfarmer();
				System.out.println(fs);
				System.out.println();
				
				fs=new Organicfarmer();
				System.out.println(fs);
				System.out.println();
			}
		}
	 


		 
	 

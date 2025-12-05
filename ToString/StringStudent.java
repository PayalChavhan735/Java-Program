package ToString;

public class StringStudent {
	int fbId;
	String name;
	int distance;
	
	StringStudent(){
		fbId=1234;
		name="Payal";
		distance=5;	
	}

	public StringStudent(int fbId, String name, int distance) {
		super();
		this.fbId = fbId;
		this.name = name;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "StringStudent [fbId=" + fbId + ", name=" + name + ", distance=" + distance + "]";
	}
	
}
class PlacedStudent extends StringStudent {
	int fbId;
	String name;
	int distance;
	String companyName;
	String designation;
	
	PlacedStudent() {
		fbId = 100;
		name = "piuu";
		distance = 10;
		companyName = "Infosis";
		designation = "Pqr";
	}

	public PlacedStudent(int fbId, String name, int distance, String companyName, String designation) {
		super();
		this.fbId = fbId;
		this.name = name;
		this.distance = distance;
		this.companyName = companyName;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return super.toString()+"\nPlacedStudent [fbId=" + fbId + ", name=" + name + ", distance=" + distance + ", companyName="
				+ companyName + ", designation=" + designation + "]";
	}
	class StudentString1 {
		public static void main(String[]args) {
			StringStudent ss=new StringStudent();
			ss=new PlacedStudent();
			System.out.println(ss);
			System.out.println();
			
			
			

		}
			
		}	
}

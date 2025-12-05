package ToString;


public class PersonString {
	String name;
	int age;
	String gender;
	int mobilno;
	
	PersonString(){
		name="Samiksha";
		age=22;
		gender="female";
		mobilno=954525089;
		
	}

	public PersonString(String name, int age, String gender, int mobilno) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobilno = mobilno;
	}

	@Override
	public String toString() {
		return "PersonString [name=" + name + ", age=" + age + ", gender=" + gender + ", mobilno=" + mobilno + "]";
	}
	
}
class Student extends PersonString{
	int rollno;
	int marks;
	
	Student(){
		rollno=17;
		marks=95;
	}

	public Student(String name, int age, String gender, int mobilno) {
		super(name, age, gender, mobilno);
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return super.toString()+"\nStudent [rollno=" + rollno + ", marks=" + marks + "]";
	}
}
	class Teacher extends PersonString{
		int Id;
		String subject;
		double salary;
		int experiences;
		
		Teacher(){
			Id=1235;
			subject="English";
			salary=50000;
			experiences= 5;
				
		}

		public Teacher(String name, int age, String gender, int mobilno) {
			super(name, age, gender, mobilno);
			this.Id = Id;
			this.subject = subject;
			this.salary = salary;
			this.experiences = experiences;
		}

		@Override
		public String toString() {
			return "Teacher [Id=" + Id + ", subject=" + subject + ", salary=" + salary + ", experiences=" + experiences
					+ "]";
		}
	}
		class Doctor extends PersonString{
			String Specialization;
			String hospitalname;
			int consultationfee;
			
			Doctor(){
				Specialization="Gynaecologiest";
				hospitalname="PMCH";
				consultationfee=1000;
			}

			public Doctor(String name, int age, String gender, int mobilno) {
				super(name, age, gender, mobilno);			
				this.Specialization = Specialization;
				this.hospitalname = hospitalname;
				this.consultationfee = consultationfee;
			}

			@Override
			public String toString() {
				return "Doctor [Specialization=" + Specialization + ", hospitalname=" + hospitalname
						+ ", consultationfee=" + consultationfee + "]";
			}
		}
class PersonString1{
	public static void main(String[]args) {
	PersonString p=new PersonString();
	p=new Student();
	System.out.println(p);
	System.out.println();
	
	p=new Teacher();
	System.out.println(p);
	System.out.println();
	
	p=new Doctor();
	System.out.println(p);
	System.out.println();
}


}

	
	
	

			
			
		
		
	
	
	
	
	


package ToString;

// ===================== SHAPE CLASS =====================
public class Shape {
	int area;
	int noOfVertices;
	int noOfAngles;
	int noOfEdges;
	static int count;     // Counts total objects created

	// Default Constructor
	Shape() {
		area = 78;
		noOfVertices = 4;
		noOfAngles = 6;
		noOfEdges = 9;
		count++;
	}

	// Parameterized Constructor
	Shape(int area, int noOfVertices, int noOfAngles, int noOfEdges) {
		this.area = area;
		this.noOfVertices = noOfVertices;
		this.noOfAngles = noOfAngles;
		this.noOfEdges = noOfEdges;
		count++;
	}

	// Proper toString()
	@Override
	public String toString() {
		return "Shape [area=" + area + ", noOfVertices=" + noOfVertices + 
				", noOfAngles=" + noOfAngles + ", noOfEdges=" + noOfEdges + "]";
	}

	// get count of objects
	public static int getCount() {
		return count;
	}
}



// ===================== CIRCLE CLASS =====================
class Circle extends Shape {
	double radius;

	Circle() {
		super();
		radius = 5.0;
	}

	Circle(int area, int v, int a, int e, double radius) {
		super(area, v, a, e);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}



// ===================== TRIANGLE CLASS =====================
class Triangle extends Shape {
	double base;
	double height;

	Triangle() {
		super();
		base = 6.0;
		height = 4.0;
	}

	Triangle(int area, int v, int a, int e, double base, double height) {
		super(area, v, a, e);
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
}



// ===================== RECTANGLE CLASS =====================
class Rectangle extends Shape {
	double base;
	double height;
	String name;

	Rectangle() {
		super();
		base = 10.0;
		height = 6.0;
		name = "Rectangle";
	}

	Rectangle(int area, int v, int a, int e, double base, double height, String name) {
		super(area, v, a, e);
		this.base = base;
		this.height = height;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Rectangle [base=" + base + ", height=" + height + ", name=" + name + "]";
	}
}



// ===================== MAIN CLASS =====================
class ToString {
	public static void main(String[] args) {
		

		Shape s = new Shape();
		System.out.println(s);

		Circle c = new Circle();
		System.out.println(c);

		Triangle t = new Triangle();
		System.out.println(t);

		Rectangle r = new Rectangle();
		System.out.println(r);

		System.out.println("Total Shape objects created : " + Shape.getCount());
	}
}

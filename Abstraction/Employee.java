package Abstraction;

//  Abstract class
abstract class Employee {
    int id;
    String name;
    double salary;
    static int count;

    // Getters & Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Employee.count = count;
    }

    // 🔹 Default Constructor
    Employee() {
        id = 11;
        name = "samiksha";
        salary = 3500000;
        count++;
    }

    // Parameterized Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        count++;
    }

    // Abstract Method
    abstract void display();
}

class SalesManager extends Employee {
    double incentive;
    int target;

    public double getIncentive() {
        return incentive;
    }
    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }
    public int getTarget() {
        return target;
    }
    public void setTarget(int target) {
        this.target = target;
    }

    SalesManager() {
        super();
        incentive = 11;
        target = 2;
    }

    public SalesManager(int id, String name, double salary, double incentive, int target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    @Override
    void display() {
        System.out.println("----- Sales Manager Details -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
    }
}

class HR extends Employee {
    double commissions;

    HR() {
        super();
        commissions = 1550.34;
    }

    public HR(int id, String name, double salary, double commissions) {
        super(id, name, salary);
        this.commissions = commissions;
    }

    @Override
    void display() {
        System.out.println("----- HR Details -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Commissions: " + commissions);
    }
}

class Admin extends Employee {
    int allowance;

    Admin() {
        super();
        allowance = 80;
    }

    Admin(int id, String name, double salary, int allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override
    void display() {
        System.out.println("----- Admin Details -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
    }
}

class Task3 {
    public static void main(String[] args) {

        SalesManager sm1 = new SalesManager();
        sm1.display();

        SalesManager sm2 = new SalesManager(112, "shalu", 70000, 12, 3);
        sm2.display();

        Admin a = new Admin();
        a.display();

        HR h = new HR();
        h.display();

        System.out.println("Employee total count: " + Employee.getCount());
    }
}

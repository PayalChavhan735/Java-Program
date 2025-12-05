package ToString;

public class Employee3 {
    int id;
    String name;
    double salary;
    static int count;

    @Override
    public String toString() {
        return "Employee3 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    Employee3() {
        id = 123;
        name = "Payal";
        salary = 50000;
        count++;
    }

    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        count++;
    }

    public static int getCount() {
        return count;
    }
}

// ---------------- SALES MANAGER ----------------
class SalesManagers extends Employee3 {
    double incentive;
    int target;

    SalesManagers() {
        super();
        incentive = 11;
        target = 2;
    }

    public SalesManagers(int id, String name, double salary, double incentive, int target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    @Override
    public String toString() {
        return "SalesManagers [id=" + id + ", name=" + name + ", salary=" + salary +
                ", incentive=" + incentive + ", target=" + target + "]";
    }
}

// ---------------- HR ----------------
class HRS extends Employee3 {
    double commissions;

    HRS() {
        super();
        commissions = 1550.34;
    }

    HRS(int id, String name, double salary, double commissions) {
        super(id, name, salary);
        this.commissions = commissions;
    }

    @Override
    public String toString() {
        return "HRS [id=" + id + ", name=" + name + ", salary=" + salary +
                ", commissions=" + commissions + "]";
    }
}

// ---------------- ADMIN ----------------
class Admins extends Employee3 {
    int allowance;

    Admins() {
        super();
        allowance = 80;
    }

    Admins(int id, String name, double salary, int allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Admins [id=" + id + ", name=" + name + ", salary=" + salary +
                ", allowance=" + allowance + "]";
    }
}

// ---------------- TEST CLASS ----------------
class Test11 {
    public static void main(String[] args) {

        SalesManagers sm1 = new SalesManagers();
        System.out.println(sm1);

        SalesManagers sm2 = new SalesManagers(112, "Shalu", 70000, 12, 3);
        System.out.println(sm2);

        Admins a = new Admins();
        System.out.println(a);

        HRS h = new HRS();
        System.out.println(h);

        System.out.println("\nTotal Employees: " + Employee3.getCount());
    }
}

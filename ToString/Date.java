package ToString;

 class Date {
	int day, month, year;
    String dow;

    // toString() method
    @Override
    public String toString() {
        return "DateString is: " + day + "/" + month + "/" + year + "/" + dow;
    }
}

// Test class
class Test1 {
    public static void main(String[] args) {

        Date d1 = new Date();
        Date d2 = new Date();

        // Default values print using toString()
        System.out.println(d1);
       // System.out.println(d2);

        // Assign values
        d1.day = 7;
        d1.month = 11;
        d1.year = 2025;
        d1.dow = "Friday";

        // Print again
        System.out.println(d1);
    }
}




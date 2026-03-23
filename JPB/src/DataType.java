public class DataType {
    public static void main(String s[]){
        // Primitive data types
        byte age = 22;
        short temperature = -5;
        int population = 1000000;
        long distanceToMoon = 384400000L;
        float price = 19.99f;
        double pi = 3.141592653589793;
        char initial = 'E';
        boolean isLonggedIn = true;

        // reference data types
        String greeting = "Hello, word!";
        int[] scores = {87, 12, 23, 56, 43};
        //class, interface
        enum DaysOfWeek {
            MONDAY, TUESDAY, WEDNESDSY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        };

        System.out.println("My age is: ");
        System.out.println(age);

        System.out.println("The current temperature is: ");
        System.out.println(temperature);

        System.out.println("The current population is: ");
        System.out.println(population);

        System.out.println("The distance from earth to the moon is: ");
        System.out.println(distanceToMoon);

        System.out.println("The price of a case of ipad 11 is: ");
        System.out.println(price);

        System.out.println("The value pf pi is: ");
        System.out.println(pi);

        System.out.println("My first initial name is: ");
        System.out.println(initial);

        System.out.println("Is the user logging in?");
        System.out.println(isLonggedIn);

        System.out.println(greeting);
        System.out.println(scores[1]);

        System.out.println(DaysOfWeek.MONDAY);

        // good practice for selectig data types
        int age1 = 25;                  // for whole numbers
        double price1 = 19.99;          // for decimal numbers
        String name1 = "EK";            // for text
        boolean isAvailable = true;     // for yes/no coditions

        // be careful with decimal caculations
        double wallet = 20.00;
        double coffee = 4.35;
        double remaining = wallet - coffee;
        System.out.printf("Money left: $%.2f\n", remaining);

    }
}
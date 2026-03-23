public class ConditionalStatements {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5 ) {
            System.out.println("The number is greater than 5");
        }

        number = 3;
        if (number > 5 ) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is not greater than 5");
        }

        number = 10;
        if (number > 15 ) {
            System.out.println("The number is greater than 15");
        } else if (number > 5) {
            System.out.println("The number is greater than 5 but not greater than 15");
        } else {
            System.out.println("The number is not greater than 5");
        }

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        int age = 25;
        if (age >= 18) {
            System.out.println("You are an adult.");

            if (age >= 65) {
                System.out.println("You are a senior citizen.");
            } else {
                System.out.println("You are not a senior citizen.");
            }
        } else {
            System.out.println("You are a minor.");
        }

    }
}

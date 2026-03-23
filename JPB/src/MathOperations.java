public class MathOperations {
    // function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void greeting (String name, int age) {
        System.out.printf("Hello, %s! You are %d years old.\n", name, age);
    }

    // method overloading example'
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

        MathOperations mathOps = new MathOperations();
        int product = mathOps.multiply(a, b);
        System.out.println("The product of " + a + " and " + b + " is " + product);

        greeting("Alice", 30);

        int sum3 = add(a, b, 5);
        System.out.println("The sum of " + a + ", " + b + " and 5 is " + sum3);
        int sum4 = add(a, b, 5, 15);
        System.out.println("The sum of " + a + ", " + b + ", 5 and 15 is " + sum4);
        
    }
}

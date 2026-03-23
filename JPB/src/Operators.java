public class Operators {
    public static void main(String s[]){
        int a = 10;
        int b = 5;
        System.out.println("A is " + a);
        System.out.println("B is " + b);

        int sum = a + b ; // The + operator adds a and b

        System.out.println("A + B is "+sum);

        // Arithmetic operators
        // +,-,*,/,%
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("A - B is " + difference);
        System.out.println("A * B is " + product);
        System.out.println("A / B is " + quotient);
        System.out.println("A % B is " + remainder);

        // Relational operators
        // ==, !=, >, <, >=, <=
        System.out.println("A == B is " + (a == b));
        System.out.println("A != B is " + (a != b));
        System.out.println("A > B is " + (a > b));
        System.out.println("A < B is " + (a < b));
        System.out.println("A >= B is " + (a >= b));
        System.out.println("A <= B is " + (a <= b));

        // Logical operators
        // &&, ||, !
        boolean x = true;
        boolean y = false;
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
        System.out.println("X && Y is " + (x && y));
        System.out.println("X || Y is " + (x || y));
        System.out.println("!X is " + (!x));

        // Assignment operators
        // =, +=, -=, *=, /=, %=
        int c = 20;
        System.out.println("C is " + c);
        c += 10; // c = c + 10
        System.out.println("C after += 10 is " + c);
        c -= 5; // c = c - 5
        System.out.println("C after -= 5 is " + c);
        c *= 2; // c = c * 2
        System.out.println("C after *= 2 is " + c);
        c /= 4; // c = c / 4
        System.out.println("C after /= 4 is " + c);
        c %= 3; // c = c % 3
        System.out.println("C after %= 3 is " + c);

        // unary operators
        // ++, --
        int d = 5;
        System.out.println("D is " + d);
        d++; // d = d + 1
        System.out.println("D after ++ is " + d);
        d--; // d = d - 1
        System.out.println("D after -- is " + d);

        // Ternary operator
        // condition ? expression1 : expression2
        int e = 15;
        String result = (e > 10) ? "Greater than 10" : "Less than or equal to 10";
        System.out.println("E is " + e);
        System.out.println("Result of ternary operator is " + result);
    }
}

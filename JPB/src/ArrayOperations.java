public class ArrayOperations {
    public static void main(String[] args) {
        // 1. Create and initialize an int array with 10 elements
        int[] numbers = {10, 5, 20, 8, 3, 7, 16, 4, 9, 2};

        // 2. Apply mathematical operators
        int addition = numbers[0] + numbers[1];
        int subtraction = numbers[2] - numbers[3];
        int multiplication = numbers[4] * numbers[5];
        int division = numbers[6] / numbers[7]; // integer division
        int modulus = numbers[8] % numbers[9];

        // 3. Print the results
        System.out.println("Addition of index 0 and 1: " + addition);
        System.out.println("Subtraction of index 2 and 3: " + subtraction);
        System.out.println("Multiplication of index 4 and 5: " + multiplication);
        System.out.println("Division of index 6 and 7: " + division);
        System.out.println("Modulus of index 8 and 9: " + modulus);

        // 4. Check each number with the next using a for loop and ternary operator
        for (int i = 0; i < numbers.length - 1; i++) {
            String comparison = (numbers[i + 1] > numbers[i]) ? "greater than" :
                                (numbers[i + 1] < numbers[i]) ? "less than" :
                                "equal to";
            System.out.println("Element at index " + (i+1) + " is " + comparison + " element at index " + i);
        }
    }
}
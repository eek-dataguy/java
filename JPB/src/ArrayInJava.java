public class ArrayInJava {
    public static void main(String[] args) {
        int [] numbers;
        numbers = new int[5];
        
        int[] moreNumbers = new int[5];

        int[] evenNumbers = {2, 4, 6, 8, 10};

        System.out.println("First element of evenNumbers is " + evenNumbers[0]);
        System.out.println("Third element of evenNumbers is " + evenNumbers[2]);
        System.out.println("Fifth element of evenNumbers is " + evenNumbers[4]);

        // change the value of the third element
        evenNumbers[2] = 12;
        System.out.println("After changing, third element of evenNumbers is " + evenNumbers[2]);

        // length of the array
        System.out.println("Length of evenNumbers array is " + evenNumbers.length);

        // loop through the array
        System.out.println("Even numbers in the array:");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(evenNumbers[i]);     
        }

        // enhanced for loop
        System.out.println("Even numbers using enhanced for loop:");
        for (int num : evenNumbers) {
            System.out.println(num);
        }

        // multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Element at row 1, column 2 of matrix is " + matrix[0][1]);
        System.out.println("Element at row 2, column 3 of matrix is " + matrix[1][2]);
        System.out.println("Element at row 3, column 1 of matrix is " + matrix[2][0]);

    }
}

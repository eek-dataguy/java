public class Loops {
    public static void main(String[] args) {
        
        for (int i = 1; i<= 5; i++) {
            System.out.println("For loop iteration " + i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println("While loop iteration " + j);
            j++;    
        }

        int k = 1;
        do {
            System.out.println("Do-While loop iteration " + k);
            k++;
        } while (k <= 5);

        for (int i = 1; i<= 10; i++){
            for (int m = 1; m <= 10; m++) {
                System.out.print(i * m + "\t");
            }
            System.out.println();
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : numbers) {
            if (num > 5){
                System.out.println("First number greater than 5 is " + num);
                break;
            }
        }

        for (int num : numbers) {
            if (num % 2 == 0) {
                continue;
            }
            System.out.println("Odd number: " + num);
        }
    }
}

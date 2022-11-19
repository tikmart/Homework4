import java.util.Scanner;

public class AverageArr {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);


        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Input random number for index: " + i);
            array[i] = sc.nextInt();
            sum += array[i];

        }
        double average = sum / array.length;
        System.out.println("The average is: " + average);


        sc.close();
    }
}
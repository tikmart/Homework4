public class OddArr {
    public static void main(String[] args) {
        int[] array = {15, 7, 22, 16, 8, 99, 35, 42};
        int count = 0;



        // checking division by 3
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 3 == 0){
                System.out.println("Divided by 3 " + array[i]);
                count++;
            }
        }
        System.out.println(count);

        System.out.println("-------------------------");

        //checking if there are even numbers
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0){
                array[i]++;
            }

            System.out.print(array[i] + " ");

        }

    }
}

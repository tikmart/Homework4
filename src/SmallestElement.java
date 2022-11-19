public class SmallestElement {
    public static void main(String[] args) {
        //finding the smallest and biggest elements and their indexes

        int[] array = {16, 7, 3, 5, 98, 4, 111, 2};
        int smallest = array[0];
        int indexS = 0;
        int biggest = array[0];
        int indexB = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]){
                smallest = array[i];
                indexS = i;
            } else if (biggest < array[i]){
                biggest = array[i];
                indexB = i;
            }
        }

        System.out.println("The smallest element is: " + smallest + " with index: " + indexS);
        System.out.println("The biggest element is: " + biggest + " with index: " + indexB);
    }

}

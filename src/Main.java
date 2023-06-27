import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        reverse(a);


        int[] b = {8,9,10,11,12,13};
        reverse2(b);

    }

    private static void reverse(int[] array){

        int maxIndex = array.length - 1;
        int[] copy = Arrays.copyOf(array, array.length);
        for(int i = 0; i <= array.length / 2; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Array = " + Arrays.toString(copy));
        System.out.println("Reversed array = " + Arrays.toString(array));

    }

    private static void reverse2(int[] array){ // different way of reversing an array

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for(int el : array){
            reversedArray[maxIndex--] = el;
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));

    }

}

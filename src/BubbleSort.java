import java.util.Arrays;

public class BubbleSort {

    public void arrayDec(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public void arrayAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }
    }

    public void bubbleSorting(int[] array) {

        int compareNo = 0;

        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                compareNo++;
                if (array[j] > array[j + 1]) {
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                break;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Liczba porównań wynosi: " + compareNo);
    }
}


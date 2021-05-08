import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();

        int[] tab1 = new int[]{1, 2, 3, 4, 5};
        int[] tab2 = new int[]{5, 4, 3, 2, 1};
        int[] tab3 = new int[99];
        sort.arrayDec(tab3);
        int[] tab4 = new int[99];
        sort.arrayAsc(tab4);
        int[] tab5 = new int[]{5, 2, 3, 1, 4};

        System.out.println(Arrays.toString(tab1));
        sort.bubbleSorting(tab1);
        System.out.println(Arrays.toString(tab2));
        sort.bubbleSorting(tab2);
        System.out.println(Arrays.toString(tab3));
        sort.bubbleSorting(tab3);
        System.out.println(Arrays.toString(tab4));
        sort.bubbleSorting(tab4);
        System.out.println(Arrays.toString(tab5));
        sort.bubbleSorting(tab5);
    }
}

package pulma.tools;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {5,8,6,7,1,2,4};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}

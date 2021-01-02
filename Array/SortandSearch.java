package Array;
import java.util.Arrays;

public class SortandSearch {
    public static void main(String[] args) throws Exception {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
         Arrays.sort(array);//遍历数组
         printArrays("数组排序结果为", array);
         int index = Arrays.binarySearch(array, 2);
        System.out.println("元素 2  在第 " + index + " 个位置");
    }

    public static void printArrays(String message, int array[]) {
        for(int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.println(",");
            }
            System.out.println(array[i]);
        }
        System.out.println();
    }
}

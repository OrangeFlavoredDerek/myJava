import java.util.*;

public class Exanmple5 {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,2,4,6,8,10};
        int x;
        boolean find = false;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        for (int i : a) {
            if (i == x) {
                System.out.println("找到了");
                find = true;
            }
        }
        if (!find) {
            System.out.println("没找到");
        }
    }
}

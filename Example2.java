import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入年份:");
        int year = input.nextInt();
        int a = year / 4;
        int b = year / 100;
        int c = year / 400;

        if ((a == 0 && b != 0)||c == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}

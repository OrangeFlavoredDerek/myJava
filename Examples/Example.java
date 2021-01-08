package Examples;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        float length;
        int days;
        Scanner input = new Scanner(System.in);

        System.out.println("请输入绳长(m)：");
        do {
            length = input.nextFloat();
        } while (length <= 0);

        System.out.println("请输入天数(天)：");
        do {
            days = input.nextInt();
        } while (days <= 0);

        for(int i = 0; i < days; i++) {
            length *= 0.5;
        }
        System.out.println("剩余绳长为" + length + "m");
    }
}

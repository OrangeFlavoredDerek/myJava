package Examples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        String surname;
        Scanner input = new Scanner(System.in);

        System.out.println("请输入您的姓氏：");
        surname = input.nextLine();
        System.out.println("请输入母亲的身高：");
        double mHeight = input.nextDouble();
        errorCheck(mHeight);
        System.out.println("请输入父亲的身高：");
        double fHeight = input.nextDouble();
        errorCheck(fHeight);

        System.out.println("你的身高预测为：" + predictionSystem(surname, mHeight, fHeight) + "cm");
    }

    public static double predictionSystem(String surname, Double mHeight, Double fHeight) {
        double urHeight;
        Scanner input = new Scanner(System.in);
        
        System.out.println("您的性别是：\n1.女性\n2.男性\n");
        int gender = input.nextInt();
        while (gender != 1 && gender != 2) {
            System.out.println("您的输入错误，请再次输入\n");
            gender = input.nextInt();
        }
        switch (gender) {
            case 1:
            System.out.println(surname + "女士你好！\n");
            break;
            case 2:
            System.out.println(surname + "先生你好！\n");
            break;
        }
        if (gender == 1) {
            urHeight = (fHeight*0.923+ mHeight)/2;
        } else {
            urHeight = (fHeight + mHeight) * 0.54;
        }

        return urHeight;
    } 

    public static void errorCheck(double height) {
        Scanner input = new Scanner(System.in);
        while (height < 70 || height > 260) {
            System.out.println("输入数值错误，请重新输入：");
            height = input.nextDouble();
        }
    }
}

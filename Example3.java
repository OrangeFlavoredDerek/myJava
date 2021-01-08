import java.util.Scanner;

//判断输入的5位整数是否为回文数
public class Example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("输入一个5为整数：");
        int n = input.nextInt();
        
        for(int i = num.length-1; i>=0; i--) {
            num[i] = n%10;
            n/=10;
        }
        for(int i=0;i<num.length/2;i++) {
            if(num[i]!=num[num.length-1-i]) { 
                 System.out.println("是回文数");
                 return; 
           } 
       } 
        System.out.println("这个数字是回文数");
    }
}

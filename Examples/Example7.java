package Examples;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        char[] arr = new char[20];
        int i = 0;
        char[] date={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if (n==0) {
            System.out.println(n);
        }
        while (n>0) {
            arr[i] = date[n%16];
            n /= 16;
            i++;
        }
        String string = new String(arr).trim();
		String str = new StringBuffer(string).reverse().toString();//reverse字符串反转函数
		System.out.println(str);
    }
}


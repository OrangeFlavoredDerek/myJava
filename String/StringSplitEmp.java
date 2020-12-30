package String;

import java.util.StringTokenizer;

//字符串分割
public class StringSplitEmp {
    public static void main(String[] args) {
        String str = "i-love-java";
        String[] temp;
        String[] temp1;
        String delimeter = "-";  // 指定分割字符
        temp = str.split(delimeter);
        temp1 = str.split(delimeter);
        //普通for循环
        for(int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
            System.out.println("");
        }

        //for-each循环
        for (String x : temp1) {
            System.out.println(x);
            System.out.println("");
        }

        //使用 StringTokennizer 设置不同分隔符来分隔字符串
        //默认的分隔符是：空格、制表符（\t）、换行符(\n）、回车符（\r)
        String anotherString = "This is String , split by StringTokenizer.";
        StringTokenizer st = new StringTokenizer(anotherString);

        //通过空格分割
        while(st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        //通过逗号分割
        StringTokenizer st1 = new StringTokenizer(anotherString, ",");
        while(st1.hasMoreElements()) {
            System.out.println(st1.nextElement());
        }
    }
}

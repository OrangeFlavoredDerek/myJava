package String;

//字符串大小写转换
public class StringToUpperCaseEmp {
    public static void main(String[] args) {
        String str = "apple";
        String str1 = "APPLE";
        String strCap = str.toUpperCase();//大写转换
        String strLowercase = str1.toLowerCase();//小写转换
        System.out.println("字符串转换为大写：" + strCap);
        System.out.println("字符串转换为小写：" + strLowercase);
    }
}

package String;

//MARK: 字符串反转
public class StringReverseExample {
    public static void main(String[] args) {
        String str = "Apple";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("反转前：" + str);
        System.out.println("反转后：" + reverse);
    }
}

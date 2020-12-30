package String;

//MARK: 删除字符串中的一个字符
public class DeleteCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(removeCharAt(str, 2));
    }
    public static String removeCharAt(String s, int position) {
        return s.substring(0, position) + s.substring(position + 1);
    }
}

//MARK: 查找字符串最后一次出现的位置
package String;

public class SearchlastString {
    public static void main(String[] args) {
        String str = "Hello World, Hello Java";
        int lastIndex = str.lastIndexOf("Java");
        if (lastIndex == -1) {
            System.out.println("String not found.");
        } else {
            System.out.println("The string Java last appeared at " + lastIndex);
        }
    }
}

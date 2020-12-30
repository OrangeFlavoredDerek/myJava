package String;

//测试两个字符串区域是否相等
//使用 regionMatches() 方法测试两个字符串区域是否相等
public class StringRegionMatch {
    public static void main(String[] args) {
        String firstStr = "Welcome to Apple";
        String secondStr = "I work with apple";
        boolean match1 = firstStr.regionMatches(11, secondStr, 12, 5);
        boolean match2 = firstStr.regionMatches(true, 11, secondStr, 12, 5);//"true"表示忽略大小写
        System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);
    }
}

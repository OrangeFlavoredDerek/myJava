package Examples;

import java.util.*;

public class Example8 {
    public static void main(String[] args) {
        int year, month, date;
        long time1, time2, betweenDays;
        Scanner reader = new Scanner(System.in);
        year = reader.nextInt();
        month = reader.nextInt()-1;
        date = reader.nextInt();

        Calendar calendar = Calendar.getInstance();//获取使用默认时区和区域设置的日历。返回的日历基于默认时区中的当前时间
        time1 = calendar.getTimeInMillis();//返回此日历的时间值（毫秒）
        calendar.set(year, month, date);
        time2 = calendar.getTimeInMillis();
        betweenDays = (time2-time1)/(1000*3600*24);
        System.out.println("星期" + (calendar.get(Calendar.DAY_OF_WEEK)+6)%7);
        System.out.println("距今还有" + betweenDays + "天");
    }
}

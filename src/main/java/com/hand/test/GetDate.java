package com.hand.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ZhengShuang
 * @date 2018/8/4 10:07
 */
public class GetDate {

    public static void main(String[] args) {
        List<Integer> bigMonth = new ArrayList<Integer>(Arrays.asList(1,3,5,7,8,10));
        List<Integer> smallMonth = new ArrayList<Integer>(Arrays.asList(4,6,9,11));
        while (true) {
            System.out.println("请输入日期(yyyy-MM-dd): " );
            Scanner in = new Scanner(System.in);
            String date = in.next();
            int year = Integer.valueOf(date.substring(0, 4));
            int month = Integer.valueOf(date.substring(5,7));
            int day = Integer.valueOf(date.substring(8));
            // 闰年处理
            if (isFyear(year)) {
                // 二月处理
                if (month == 2 && day == 29) {
                    System.out.println("下一天为:" + year + "-03-01");
                } else if (month == 12 && day == 31) {
                    // 十二月处理
                    System.out.println("下一天为" + (year + 1) + "-01-01");
                } else if (day == 31 && bigMonth.contains(month)) {
                    // 大月处理
                    System.out.println("下一天为:" + year +"-"+ (month + 1) + "-01");
                } else if (day == 30 && smallMonth.contains(month)) {
                    // 小月处理
                    System.out.println("下一天为:" + year +"-"+ (month + 1) + "-01");
                } else {
                    if (bigMonth.contains(month) || day > 31)
                    {
                        System.out.println("输入日期不存在");
                        continue;
                    }
                    if (smallMonth.contains(month) && day > 30)
                    {
                        System.out.println("输入日期不存在");
                        continue;
                    }
                    System.out.println("下一天为:" + year +"-"+month +"-"+(day+1));
                }
            }
            // 平年处理
            if (!isFyear(year)) {
                // 二月处理
                if (month == 2 && day == 28) {
                    System.out.println("下一天为:" + year + "-03-01");
                } else if (month == 12 && day == 31) {
                    // 十二月处理
                    System.out.println("下一天为" + (year + 1) + "-01-01");
                } else if (day == 31 && bigMonth.contains(month)) {
                    // 大月处理
                    System.out.println("下一天为:" + year +"-"+ (month + 1) + "-01");
                } else if (day == 30 && smallMonth.contains(month)) {
                    // 小月处理
                    System.out.println("下一天为:" + year +"-"+ (month + 1) + "-01");
                } else {

                    if (bigMonth.contains(month) || day > 31)
                    {
                        System.out.println("输入日期不存在");
                        continue;
                    }
                    if (smallMonth.contains(month) && day > 30)
                    {
                        System.out.println("输入日期不存在");
                        continue;
                    }
                    System.out.println("下一天为:" + year +"-"+month +"-"+(day+1));
                }
            }
        }
    }

    public static boolean isFyear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return true;
    }
}

package com.hand.test;

import java.util.Scanner;

/**
 * @author ZhengShuang
 * @date 2018/8/4 9:37
 */
public class CountNumber {

    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入工资：");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (a <= 3500) {
                System.out.println("您不需要交税");
            }
            int b = a - 3500;
            if ( b >= 0) {
                if (b <= 1500) {
                    System.out.println("所需要缴纳的税费为：" + b * 0.03 + "元");
                }
                if (1500 < b && b <= 4500) {
                    System.out.println("所需要缴纳的税费为：" + b * 0.10 + "元");
                }
                if (4500 < b && b <= 9000) {
                    System.out.println("所需要缴纳的税费为：" + b * 0.20 + "元");
                }
                if (9000 < b && b <= 35000) {
                    System.out.println("所需要缴纳的税费为：" + b * 0.25 + "元");
                }
                if (35000 < b && b <= 55000) {
                    System.out.println("所需要缴纳的税费为：" + b * 0.30 + "元");
                }
                if (55000 < b && b <= 80000) {
                    System.out.println("所需要缴纳的税费为：" + b * 0.35 + "元");
                }
                if (b >= 80000) {
                    System.out.println("所需要缴纳的税费为：" + b * 0.45 + "元");
                }
            } else {
                continue;
            }
        }
    }
}

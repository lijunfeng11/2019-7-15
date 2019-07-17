package com.itheima_day04;

import java.util.Random;
import java.util.Scanner;

/*
 分析以下需求，并用代码实现
	1.键盘录入班级人数
	2.根据录入的班级人数创建数组
	3.利用随机数产生0-100的成绩(包含0和100)
	4.要求:
		(1)打印该班级的不及格人数
		(2)打印该班级的平均分
		(3)演示格式如下:
			请输入班级人数:
			键盘录入:100
			控制台输出:
				不及格人数:19
				班级平均分:87

 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("录入班级人数:");
		int num = sc.nextInt();

		// 定义数组 , 数组中存储的是班级每个人的分数
		int[] arr = new int[num];

		Random r = new Random();

		// 通过随机数0-100给数组的每一个元素赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(46) + 55;
		}

		// 定义统计变量, 记录的是班级不及格人数
		int count = 0;

		// 定义统计变量, 记录的是班级总分
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (arr[i] < 60) {
				count++;
			}
		}

		System.out.println("不及格人数为:" + count);
		System.out.println("平均分为:" + (sum * 1.0 / num));
	}

}

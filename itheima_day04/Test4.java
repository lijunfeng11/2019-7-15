package com.itheima_day04;

import java.util.Scanner;

/*
	设有一个长度为5的数组，数组元素通过键盘录入，如下所示：
	int[] arr = {1,3,-1,5,-2}
	要求：
	创建一个新数组newArr[],新数组中元素的存放顺序与原数组中的元素逆序，并且如果原数组中的元素值小于0，
	在新数组中按0存储。最后输出原数组和新数组中的内容
	
	打印格式：
	请输入5个整数：
	1
	3
	-1
	5
	-2
	原数组内容：
	1 3 -1 5 -2 
	新数组内容：
	0 5 0 3 1

 */
public class Test4 {
	public static void main(String[] args) {
		int[] arr = new int[5]; // 1 3 -1 5 -2

		Scanner sc = new Scanner(System.in);

		// 通过键盘录入给数组的每一个元素赋值
		for (int i = 0; i < arr.length; i++) {
			System.out.println("录入第" + (i + 1) + "个元素:");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		int[] newArr = new int[arr.length];// {0 , 5 , 0 , 3 , 1}

		int index = 0;// 模拟数组的索引 4

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < 0) {
				newArr[index] = 0;
			} else {
				newArr[index] = arr[i];
			}

			index++;// 索引自增
		}

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}

	}

}

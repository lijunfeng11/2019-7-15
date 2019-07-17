package com.itheima_day04;

import java.util.Random;

/*
	将数字1-10保存到一个长度为10的一维数组中
	定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
	给新数组的元素赋值
	求新数组所有元素的和

 */
public class Test2 {
	public static void main(String[] args) {

		int[] arr = new int[10]; // 1 2 3 4 5 6 7 8 9 10
		// 给数组赋值 1-10
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] newArr = new int[3];// {}

		Random r = new Random();

		for (int i = 0; i < newArr.length; i++) {
			int index = r.nextInt(arr.length);
			newArr[i] = arr[index];
			System.out.println(newArr[i]);
		}

		int sum = 0;
		for (int i = 0; i < newArr.length; i++) {
			sum += newArr[i];
		}

		System.out.println("新数组的元素和为:" + sum);

	}

}

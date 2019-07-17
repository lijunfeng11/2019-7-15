package com.itheima_day04;

import java.util.Random;

/*
 
	 定义长度为10的int数组,数组中的10个元素为随机生成的1-100的数字,要求:打印数组中第二大的数和第二小的数字
	打印格式:
	原数组内容
	90 34 12 35 98 23 17 71 4 66 
	数组中的第二大的数字为:90
	数组中的第二小的数字为:12
	
	
	4 2 1 5 3 2 3
	
	5  
	1

 */
public class Test5 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {// i = 3
			arr[i] = r.nextInt(100) + 1;

			for (int x = 0; x < i; x++) {
				if (arr[i] == arr[x]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		// 冒泡排序 给数组进行升序
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		System.out.println("第二小的元素为:" + arr[1]);
		System.out.println("第二大的元素为:" + arr[arr.length - 2]);

		System.out.println("-------------------------");

		int[] arr1 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = r.nextInt(100) + 1;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		int max = arr1[0]; // 2
		int min = arr1[0]; // 1

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}

			if (arr1[i] < min) {
				min = arr1[i];
			}
		}

		System.out.println("数组的最大值为:" + max);
		System.out.println("数组的最小值为:" + min);

		int max1 = min;// 第二大的值
		int min1 = max;// 第二小的值

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max1 && arr1[i] != max) {
				max1 = arr1[i];
			}

			if (arr1[i] < min1 && arr1[i] != min) {
				min1 = arr1[i];
			}
		}

		System.out.println("数组的第二大值为:" + max1);
		System.out.println("数组的第二小值为:" + min1);

	}

}

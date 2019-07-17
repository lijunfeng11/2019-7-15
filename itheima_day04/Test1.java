package com.itheima_day04;

/*
	已知数组int[] nums = {5,10,15},要求创建一个新数组
	1.新数组的长度和已知数组长度相同
	2.新数组每个元素的值 是已知数组对应位置元素的2倍
	3.在控制台中打印新数组的所有元素
	
	5  10  15 
	10 20  30

 */
public class Test1 {
	public static void main(String[] args) {
		int[] nums = { 5, 10, 15 };

		int[] newArr = new int[nums.length];// {10 , 20 , 30}

		for (int i = 0; i < newArr.length; i++) {// i = 2
			newArr[i] = nums[i] * 2;
			System.out.println(newArr[i]);
		}
	}

}

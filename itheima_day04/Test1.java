package com.itheima_day04;

/*
	��֪����int[] nums = {5,10,15},Ҫ�󴴽�һ��������
	1.������ĳ��Ⱥ���֪���鳤����ͬ
	2.������ÿ��Ԫ�ص�ֵ ����֪�����Ӧλ��Ԫ�ص�2��
	3.�ڿ���̨�д�ӡ�����������Ԫ��
	
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

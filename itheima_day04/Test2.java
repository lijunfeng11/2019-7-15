package com.itheima_day04;

import java.util.Random;

/*
	������1-10���浽һ������Ϊ10��һά������
	����һ��������,����Ϊ3,ȡ��ԭ���������������Ԫ��(�������Ƿ��ظ�)
	���������Ԫ�ظ�ֵ
	������������Ԫ�صĺ�

 */
public class Test2 {
	public static void main(String[] args) {

		int[] arr = new int[10]; // 1 2 3 4 5 6 7 8 9 10
		// �����鸳ֵ 1-10
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

		System.out.println("�������Ԫ�غ�Ϊ:" + sum);

	}

}

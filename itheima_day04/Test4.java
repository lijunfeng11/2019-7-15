package com.itheima_day04;

import java.util.Scanner;

/*
	����һ������Ϊ5�����飬����Ԫ��ͨ������¼�룬������ʾ��
	int[] arr = {1,3,-1,5,-2}
	Ҫ��
	����һ��������newArr[],��������Ԫ�صĴ��˳����ԭ�����е�Ԫ�����򣬲������ԭ�����е�Ԫ��ֵС��0��
	���������а�0�洢��������ԭ������������е�����
	
	��ӡ��ʽ��
	������5��������
	1
	3
	-1
	5
	-2
	ԭ�������ݣ�
	1 3 -1 5 -2 
	���������ݣ�
	0 5 0 3 1

 */
public class Test4 {
	public static void main(String[] args) {
		int[] arr = new int[5]; // 1 3 -1 5 -2

		Scanner sc = new Scanner(System.in);

		// ͨ������¼��������ÿһ��Ԫ�ظ�ֵ
		for (int i = 0; i < arr.length; i++) {
			System.out.println("¼���" + (i + 1) + "��Ԫ��:");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		int[] newArr = new int[arr.length];// {0 , 5 , 0 , 3 , 1}

		int index = 0;// ģ����������� 4

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < 0) {
				newArr[index] = 0;
			} else {
				newArr[index] = arr[i];
			}

			index++;// ��������
		}

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}

	}

}

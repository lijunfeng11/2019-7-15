package com.itheima_day04;

import java.util.Random;

/*
 
	 ���峤��Ϊ10��int����,�����е�10��Ԫ��Ϊ������ɵ�1-100������,Ҫ��:��ӡ�����еڶ�������͵ڶ�С������
	��ӡ��ʽ:
	ԭ��������
	90 34 12 35 98 23 17 71 4 66 
	�����еĵڶ��������Ϊ:90
	�����еĵڶ�С������Ϊ:12
	
	
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

		// ð������ �������������
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

		System.out.println("�ڶ�С��Ԫ��Ϊ:" + arr[1]);
		System.out.println("�ڶ����Ԫ��Ϊ:" + arr[arr.length - 2]);

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

		System.out.println("��������ֵΪ:" + max);
		System.out.println("�������СֵΪ:" + min);

		int max1 = min;// �ڶ����ֵ
		int min1 = max;// �ڶ�С��ֵ

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max1 && arr1[i] != max) {
				max1 = arr1[i];
			}

			if (arr1[i] < min1 && arr1[i] != min) {
				min1 = arr1[i];
			}
		}

		System.out.println("����ĵڶ���ֵΪ:" + max1);
		System.out.println("����ĵڶ�СֵΪ:" + min1);

	}

}

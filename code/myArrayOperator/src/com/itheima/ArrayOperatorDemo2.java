package com.itheima;

/*
               ���������ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
               ʹ�þ�̬��ʼ��һ������,�����е�Ԫ�ظ�ֵΪ11,33,77,22
	    ��������е���Сֵ����ӡ
 */
public class ArrayOperatorDemo2 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 12, 45, 98, 73, 60 };
		// ���������
		int max = arr[0];
		// �ӵڶ���Ԫ�ؿ�ʼ����
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				// ���Ԫ�ر�max����ô����������������������
				max = arr[x];
			}
		}
		// ���max�Ϳ�����
		System.out.println("max:" + max);
		System.out.println("----------------------");

		// ���������
		int min = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}
		System.out.println("min:" + min);
	}
}

package com.itheima;

/*
 * �����������(������������е�ÿһ��Ԫ��)
 */
public class ArrayOperatorDemo {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 11, 22, 33, 44, 55 };

		// ԭʼ����
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("------------------");

		// ��ѭ���Ľ�����
		// ��forѭ����ȡ������0-4
		for (int x = 0; x < 5; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("------------------");

		// Ϊ�˽������ȥ�������е�Ԫ�ظ������⣬������ṩ��һ�����ԣ�length
		// ���ڻ�ȡ�����е�Ԫ�ظ���
		// ʹ�ø�ʽ��������.length
		System.out.println("arr���鹲��" + arr.length + "��Ԫ��");
		System.out.println("------------------");

		// ��������ı�׼�����
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}

	}
}

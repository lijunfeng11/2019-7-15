package com.itheima_02;

/*
 * ����һ�����飬�����������Ԫ�ء�Ȼ��������е�Ԫ�ظ�ֵ���ٴ������������Ԫ�ء�
 */
public class ArrayTest {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = new int[3];

		// �����������Ԫ��
		System.out.println("arr:" + arr);
		System.out.println("arr[0]:" + arr[0]);
		System.out.println("arr[1]:" + arr[1]);
		System.out.println("arr[2]:" + arr[2]);
		System.out.println("--------------");

		// Ȼ��������е�Ԫ�ظ�ֵ
		arr[0] = 100;
		arr[2] = 200;

		// �ٴ������������Ԫ��
		System.out.println("arr:" + arr);
		System.out.println("arr[0]:" + arr[0]);
		System.out.println("arr[1]:" + arr[1]);
		System.out.println("arr[2]:" + arr[2]);

		
	}
}

package com.itheima_02;
/*
 * �����������飬�ֱ������������Ԫ�ء�Ȼ��ֱ�������е�Ԫ�ظ�ֵ���ֱ��ٴ������������Ԫ�ء�
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		//������������
		int[] arr = new int[2];
		int[] arr2 = new int[3];
		
		//�ֱ������������Ԫ��
		System.out.println("arr:"+arr);
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println("--------------");
		
		System.out.println("arr2:"+arr2);
		System.out.println("arr2[0]:"+arr2[0]);
		System.out.println("arr2[1]:"+arr2[1]);
		System.out.println("arr2[2]:"+arr2[2]);
		System.out.println("--------------");
		
		//Ȼ��ֱ�������е�Ԫ�ظ�ֵ
		arr[1] = 100;
		
		arr2[0] = 200;
		arr2[1] = 300;
		
		//�ֱ��ٴ������������Ԫ��
		System.out.println("arr:"+arr);
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println("--------------");
		
		System.out.println("arr2:"+arr2);
		System.out.println("arr2[0]:"+arr2[0]);
		System.out.println("arr2[1]:"+arr2[1]);
		System.out.println("arr2[2]:"+arr2[2]);
		System.out.println("--------------");
	}
}

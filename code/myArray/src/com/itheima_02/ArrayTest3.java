package com.itheima_02;
/*
 * �����������飬�ȶ���һ�����飬��ֵ�������Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ������顣
 * Ȼ����ڶ������鸳ֵ���ٴ�����������������Ԫ�ء�
 * 
 *  ����һ������Ϊ��int[] arr  = new int[5];
 *  			arr[0] = 10;
 *  			arr[1] = 20;
 *  			...
	�ֱ��������������arr1,arr2ָ�������
		int[] arr1 = arr;
		int[] arr2 = arr;
	����arr1Ϊ�����е�����Ԫ�ظ�ֵ
	����arr2 ȡ�������е�Ԫ�ص�ֵ
	
	
	����һ������Ϊ��int[] arr  = {1,2,3,4,5};
	�ֱ��������������arr1,arr2ָ�������
		int[] arr1 = arr;
		int[] arr2 = arr;
	����arr1Ϊ�����е�����Ԫ�ظ�ֵ
	����arr2 ȡ�������е�Ԫ�ص�ֵ



 */
public class ArrayTest3 {
	public static void main(String[] args) {
		//�ȶ���һ������
		int[] arr = new int[3];
		
		//��ֵ
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		//���
		System.out.println("arr:"+arr);
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println("arr[2]:"+arr[2]);
		System.out.println("--------------");
		
		//Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ�������
		int[] arr2 = arr;
		
		//Ȼ����ڶ������鸳ֵ
		arr2[0] = 111;
		arr2[1] = 222;
		arr2[2] = 333;
		
		//�ٴ�����������������Ԫ��
		System.out.println("arr:"+arr);
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println("arr[2]:"+arr[2]);
		System.out.println("--------------");
		
		System.out.println("arr2:"+arr2);
		System.out.println("arr2[0]:"+arr2[0]);
		System.out.println("arr2[1]:"+arr2[1]);
		System.out.println("arr2[2]:"+arr2[2]);
	}
}

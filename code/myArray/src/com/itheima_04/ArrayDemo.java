package com.itheima_04;
/*
 * ��������С���⣺
 * 		ArrayIndexOutOfBoundsException:��������Խ���쳣
 * 			��β�������?���Ƿ����˲����ڵ�������
 * 
 * 		NullPointerException:��ָ���쳣
 * 			��β�������?null��ָ����ָ����ڴ�����ݣ������ǻ��ڷ��ʶ��ڴ������
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//��������
		int[] arr = {1,2,3};
		
		//���������е�Ԫ��
		//System.out.println(arr[3]);
		
		//�����������ͣ��࣬�ӿڣ�����
		//������null�����ǿ��Ը�ֵ�������������͵ģ���ʾ�����ò���ָ����ڴ������
		arr = null;
		System.out.println(arr[1]);
	}
}

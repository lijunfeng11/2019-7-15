package com.itheima.level02;

import java.util.Random;

/*
 * ���峤��Ϊ10��int����,�����е�10��Ԫ��Ϊ������ɵ�1-100������,Ҫ��:����ʽ��ӡ�����е�Ԫ������
	����:
	����ԭ����:{1,2,3,4,5}
	��ӡ������:[1, 2, 3, 4, 5]
	����:
		1.��ӡ[
		2.��������
			(1)��ӡ��ǰԪ��
			(2)����������һ��Ԫ��,���ӡ���ſո�", "
		3.��ӡ]
			

 */
public class Task06 {
	public static void main(String[] args) {
		//����һ������Ϊ10��int���͵�����
		int[] arr = new int[10];
		//����Random����
		Random r = new Random();
		//����10��1-100�������Ϊ����Ԫ�ظ�ֵ
		for(int i = 0;i<arr.length;i++) {
			arr[i] = r.nextInt(100)+1;
		}
		
		// 1.��ӡ[
		System.out.print("[");
		// 2.��������
		for(int i = 0;i<arr.length;i++) {
		// (1)��ӡ��ǰԪ��
			System.out.print(arr[i]);
		// (2)��������һ��Ԫ��,���ӡ���ſո�", "
			if(i!=arr.length-1)
				System.out.print(", ");
		}
		// 3.��ӡ]
		System.out.println("]");
		
	}
}

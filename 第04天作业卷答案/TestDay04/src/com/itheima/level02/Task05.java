package com.itheima.level02;

import java.util.Arrays;
import java.util.Random;

/*
 * ���峤��Ϊ10��int����,�����е�10��Ԫ��Ϊ������ɵ�1-100������,Ҫ��:��ӡ�����еڶ�������͵ڶ�С������
 */
public class Task05 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();
		for(int i = 0;i<arr.length;i++) {
			arr[i] = r.nextInt(100)+1;
		}
		//Ϊ�˷���鿴���,�ȶ������е�Ԫ�ذ��մ�С�����˳������
		
		//Arrays.sort(arr);
		System.out.println("ԭ��������");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//��ӡ�����еڶ������
		int firstMax = Integer.MIN_VALUE,secondMax = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > secondMax) {
				if(arr[i] > firstMax) {
					secondMax = firstMax;
					firstMax = arr[i];
				} else {
					secondMax = arr[i];
				}
			}
		}
		System.out.println("�����еĵڶ��������Ϊ:"+secondMax);
		//��ӡ�����еڶ�С����
		int firstMin = Integer.MAX_VALUE,secondMin = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] < secondMin) {
				if(arr[i] < firstMin) {
					secondMin = firstMin;
					firstMin = arr[i];
				} else {
					secondMin = arr[i];
				}
			}
		}
		System.out.println("�����еĵڶ�С������Ϊ:"+secondMin);
	}
}

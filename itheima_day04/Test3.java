package com.itheima_day04;

import java.util.Random;
import java.util.Scanner;

/*
 �����������󣬲��ô���ʵ��
	1.����¼��༶����
	2.����¼��İ༶������������
	3.�������������0-100�ĳɼ�(����0��100)
	4.Ҫ��:
		(1)��ӡ�ð༶�Ĳ���������
		(2)��ӡ�ð༶��ƽ����
		(3)��ʾ��ʽ����:
			������༶����:
			����¼��:100
			����̨���:
				����������:19
				�༶ƽ����:87

 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¼��༶����:");
		int num = sc.nextInt();

		// �������� , �����д洢���ǰ༶ÿ���˵ķ���
		int[] arr = new int[num];

		Random r = new Random();

		// ͨ�������0-100�������ÿһ��Ԫ�ظ�ֵ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(46) + 55;
		}

		// ����ͳ�Ʊ���, ��¼���ǰ༶����������
		int count = 0;

		// ����ͳ�Ʊ���, ��¼���ǰ༶�ܷ�
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (arr[i] < 60) {
				count++;
			}
		}

		System.out.println("����������Ϊ:" + count);
		System.out.println("ƽ����Ϊ:" + (sum * 1.0 / num));
	}

}

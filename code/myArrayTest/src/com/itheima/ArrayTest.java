package com.itheima;

import java.util.Scanner;

/*
 * �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
 * ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ��4����ίƽ��ֵ��
 * ��д����ʵ�֡�(������С������)
 * ������
 * 		A:����һ������Ϊ6������
 * 		B:��ί��ֵ����ݲ��ü���¼��ʵ��
 * 		C:д�����ȡ��������ֵ(��߷�)
 * 		D:д�����ȡ�������Сֵ(��ͷ�)
 * 		E:д�����������е�Ԫ�غ�(�ܷ�)
 * 		F:ƽ���֣�(�ܷ�-��߷�-��ͷ�)/(arr.length-2)
 * 		G:���ƽ���ּ���
 */
public class ArrayTest {
	public static void main(String[] args) {
		// ����һ������Ϊ6������
		int[] arr = new int[6];
		// ��ί��ֵ����ݲ��ü���¼��ʵ��
		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < arr.length; x++) {
			System.out.println("�������" + (x + 1) + "����ί�����ķ�����");
			int score = sc.nextInt();
			arr[x] = score;
		}
		// д�����ȡ��������ֵ(��߷�)
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		// д�����ȡ�������Сֵ(��ͷ�)
		int min = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}

		// д�����������е�Ԫ�غ�(�ܷ�)
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}

		// ƽ���֣�(�ܷ�-��߷�-��ͷ�)/(arr.length-2)
		int avg = (sum - max - min) / (arr.length - 2);

		// ���ƽ���ּ���
		System.out.println("��ѡ�ֵ����յ÷��ǣ�" + avg);
	}
}

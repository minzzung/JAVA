package javatest1_1;

import java.util.Scanner;
public class test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ� : ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a+b<=c) {
			System.out.println("�ﰢ���� ��������� �ʽ��ϴ�.");
		}
		else if(b+c<=a) {
			System.out.println("�ﰢ���� ��������� �ʽ��ϴ�.");
		}
		else if(c+a<=b) {
			System.out.println("�ﰢ���� ��������� �ʽ��ϴ�.");
		}
		else {
			double result = 0;
			double s =(a+b+c)*0.5;
			result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.printf("�ﰢ���� ���̴� %f�Դϴ�.\n",result);
		}

	}

}
package javatest1_1;

import java.util.Scanner;
public class test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오 : ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a+b<=c) {
			System.out.println("삼각형이 만들어지지 않습니다.");
		}
		else if(b+c<=a) {
			System.out.println("삼각형이 만들어지지 않습니다.");
		}
		else if(c+a<=b) {
			System.out.println("삼각형이 만들어지지 않습니다.");
		}
		else {
			double result = 0;
			double s =(a+b+c)*0.5;
			result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.printf("삼각형의 넓이는 %f입니다.\n",result);
		}

	}

}
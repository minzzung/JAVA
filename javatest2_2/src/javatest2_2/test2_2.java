package javatest2_2;


import java.util.*;

public class test2_2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("������ �Է��ϼ��� : ");
		int input= in.nextInt();
		

		int numCount = 1;
		for(int i = input ; i > 0; i--)
		{ 
			for(int x =0; x<numCount;x++)
			{
				System.out.print("*");
			}
			for(int y = 0 ; y < (input-numCount); y++)
			{
				System.out.print(" ");
			}
			for(int y = 0 ; y < (input-numCount-1); y++)
			{
				System.out.print(" ");
			}
			for(int x =0; x<numCount;x++)
			{
				if((i == 1)&&(x ==0))
				{
					x++;
				}
				System.out.print("*");
			}
			numCount++;
			System.out.printf("\n");
			
		}
	}

}
package javatest2_3;

import java.util.Scanner;

public class test2_3 {
	static void drawmonth(int mon, int start)
	{
		int days[]= { 31,28,31,30,31,30,31,31,30,31,30,31 };
		
		System.out.printf("\n");
		System.out.printf("%d��\n",start+1);
    	
    	for(int x= 1;x<mon;x++)
    	{
    		System.out.print("*");
    	}
    	for(int y=mon;y<days[start]+1;y++)
    	{
    		System.out.print(" "+ y);
    		if((mon-1+y)%7==0)
    		{
    			System.out.println();//�ٹٲ�
    		}
    	}

    	System.out.printf("\n");
		return; 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("���� 1�� 1���� ����� �ΰ���? ");
		String strIn = in.next();
		String day = "�Ͽ�ȭ�������";
		int a = day.indexOf(strIn) +1;

		for (int i = 0; i < 12; i++)
		{
			drawmonth(a,i);
		}
		
	}

}

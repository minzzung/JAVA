package javatest2_3;

import java.util.Scanner;

public class test2_3 {
	static void drawmonth(int mon, int start)
	{
		int days[]= { 31,28,31,30,31,30,31,31,30,31,30,31 };
		
		System.out.printf("\n");
		System.out.printf("%d월\n",start+1);
    	
    	for(int x= 1;x<mon;x++)
    	{
    		System.out.print("*");
    	}
    	for(int y=mon;y<days[start]+1;y++)
    	{
    		System.out.print(" "+ y);
    		if((mon-1+y)%7==0)
    		{
    			System.out.println();//줄바꿈
    		}
    	}

    	System.out.printf("\n");
		return; 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("올해 1월 1일은 어떤요일 인가요? ");
		String strIn = in.next();
		String day = "일월화수목금토";
		int a = day.indexOf(strIn) +1;

		for (int i = 0; i < 12; i++)
		{
			drawmonth(a,i);
		}
		
	}

}

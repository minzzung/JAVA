package javatest1_1;


import java.util.Scanner;

public class test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("영문자를 입력하십시오: ");
		while(in.hasNext())
		{
			String strIn = in.next();
			char chIn = strIn.charAt(0);
			if(((chIn)>='a'&&(chIn)<='z')||((chIn)>='A'&&(chIn)<='Z'))
			{
				if(((chIn)>='a'&&(chIn)<='z'))
				{
					chIn -= 32;
				}
				else
				{
					chIn += 32;
				}
				System.out.println("변환된 문자 : "+chIn);
			}
			else
				System.out.println("영문자가 아닙니다.다시 입력해 주십시오.");
			
		
		}
	}

}

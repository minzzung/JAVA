package javatest1_1;


import java.util.Scanner;

public class test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("�����ڸ� �Է��Ͻʽÿ�: ");
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
				System.out.println("��ȯ�� ���� : "+chIn);
			}
			else
				System.out.println("�����ڰ� �ƴմϴ�.�ٽ� �Է��� �ֽʽÿ�.");
			
		
		}
	}

}

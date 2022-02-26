package javatest3_3;
import java.util.*;
public class test3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		System.out.printf("정수 3개를 입력하시오\n");
		String str = in.nextLine();
		System.out.println(str);
		//str= str.trim(); 
		String[] arr = str.split(",");
		int array[]= {0,0,0};		
		
		for(int i = 0;i<3;i++)
		{
			arr[i]= arr[i].trim();  
			array[i] = Integer.parseInt(arr[i]);
		}
		int a = array[0];
		int b = array[1];
		int c = array[2];
 		
		if(a+b<=c)
		{
			System.out.println("삼각형이 만들어지지않습니다.");
		}
		else if(b+c<=a)
		{
			System.out.println("삼각형이 만들어지지않습니다.");
		}
		else if(c+a<=b)
		{
			System.out.println("삼각형이 만들어지지않습니다.");
		}
		else
		{
			double result = 0;
			double s =(a+b+c)*0.5;
			result = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.printf("삼각형의 넓이는 %f입니다.\n",result);
		}
	}
	
}

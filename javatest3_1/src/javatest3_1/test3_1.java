package javatest3_1;
import java.util.*;
public class test3_1 {
	static void swap(int a,int b)
	{
		int swap = 0;
		swap =a;
		a=b;
		b=swap;
	}
	
	static void stort(int[] arr)
	{
		int min;
		for(int i = 0;i<9;i++)
		{
			min = i;
			for(int j=i+1;j<10;j++)
			{
				if(arr[min]>arr[j])
				{
					min = j;
				}
			}
			swap(arr[min],arr[i]);
			int swap = 0;
			swap =arr[min];
			arr[min]=arr[i];
			arr[i]=swap;
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//System.out.print("정수 10개를 입력받으시오");
		
		int[] arr= new int[10];
		
		for (int i=1;i<=10;i++)
		{
			System.out.printf("정수를입력하시오 %d num : ",i);
			arr[i-1]= in.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		stort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}

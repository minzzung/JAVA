package javatest3_2;
import java.util.*;

public class test3_2 {
	
	
	static void sort(int[] arr)
	{
		int min;
		for(int i = 0;i<arr.length-1;i++)
		{
			min = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min = j;
				}
			}
			int swap = 0;
			swap =arr[min];
			arr[min]=arr[i];
			arr[i]=swap;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[][] =  new int [5][6];
		double randnum = Math.random(); 
		for (int i=0;i<5;i++)
		{
			int j=0;
			
			while(j<arr[i].length)
			{
				int rand_temp =(int)(Math.random()*(46-1+1))+1;
				for(int k = 0; k <j; k++) 
				{
					if( rand_temp == arr[i][k])
						continue;
				}
				arr[i][j]=rand_temp;
				j++;
			}
			sort(arr[i]);
			for(int r=0;r<arr[i].length;r++)
			
				System.out.print(arr[i][r]+"\t");			
									
			System.out.println();
			//sort(arr[i]);
			
			
			//System.out.println(Arrays.toString(arr));
		}
		
		//System.out.println(Arrays.toString(arr));
		

	}

}

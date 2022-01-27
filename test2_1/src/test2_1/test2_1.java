package test2_1;

public class test2_1 {
	static void printMultTable(int argI)
	{
		for(int x = 1; x <= argI ; x++)
		{
			for(int y = 1; y <= x ; y++)
			{
				System.out.print(x*y+" ");
			}
			System.out.printf("\n");
		}
		return;
	}
	public static void main (String args[])
	{
		printMultTable(7);
	}
}
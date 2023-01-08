package Logical;

public class P02 
{
	public static void main(String[] args)
	{
		int num = 153;
		
		int sum = 0;
		
		for(int i=num;i>=1;i=i/10)
		{
			int rem = i%10;
			
			sum = sum + (rem*rem*rem);
			
		}
		
		System.out.println(sum);
		
		if(num==sum)
		{
			System.out.println("number is armstring number");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}

}

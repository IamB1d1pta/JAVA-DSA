import java.util.Scanner;
class Calculate
{
	public void addition(int[] arr,int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);

	}
	public void substraction(int[] arr,int n)
	{
		int sub=0;
		for(int i=0;i<n;i++)
		{
			
				sub=sub-arr[i];
			
		}
		System.out.println(sub);

	}
	public void multiplication(int[] arr,int n)
	{	
		int mul=1;
		for(int i=0;i<n;i++)
		{
			mul=mul*arr[i];
		}
		System.out.println(mul);
	}
	public void divition(int[] arr,int n)
	{
		int div=1;
		for(int i=0;i<n;i++)
		{
			div=arr[i]/div;
		}
		System.out.println(div);

	}
	
	
	
}
class Calculator
{
	public static void main(String[] args) {
		Calculate m=new Calculate();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter number of operator for calculation...");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements for calculation...");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("1.addition\n2.substraction\n3.multiplication\n4.divition");
			System.out.println("Enter your choice...");
			int ch=sc.nextInt();
			switch(ch)
			{
					case 1:
						m.addition(arr,n);
						break;
					case 2:
						m.substraction(arr,n);
						break;
					case 3:
						m.multiplication(arr,n);
						break;
					case 4:
						m.divition(arr,n);
						break;
					default:
						System.out.println("Invalid choice");
			}
		}
	}
}
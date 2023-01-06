import java.util.*;
class Fibonacci
{	
	 class test
	{
	 void fibo()
	{

		int n=8;
		int a=0;
		int b=1;
		System.out.println(a+" ");
		System.out.println(b+" ");
		
		while(n>0)
		{
			int x=a+b;
			System.out.println(x+" ");
			a=b;
			b=x;
			n=n-1;
		}
	}
  }
	public static void main(String[] args) {
	Fibonacci m=new test();
	m.fibo();
	}
}

import java.lang.Math;
import java.util.Scanner;

class PowOfNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		double a=sc.nextInt();
		System.out.println("Enter power");
		double b=sc.nextInt();
		double res=Math.pow(a,b);
		System.out.println("power is");
		System.out.println(res);
	}
}
import java.util.Scanner;
import java.util.*;
class search
{
	public void search()
	{
		int count=0;
		int pos=0; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array...");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements...");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter elements to delete");
		int ele =sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==ele)
			{
				count=1;
				 pos=i;
			}
		}
		if(count==1)
		{
			for(int i=pos;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					arr[i]=arr[i+1];
				}

			}
			System.out.println("new array...");
			for(int i=0;i<n-1;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			System.out.println("element is not present in array");
		}



	}
}
class BinarySearch
{
	public static void main(String[] args) {
		search obj=new search();
		obj.search();
		
	}
}
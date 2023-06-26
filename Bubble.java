import java.util.*;
class BubbySort{
	void bsort(int[] ar,int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i-1; j++){
				int temp;
				if (arr[i]>ar[j]){
					temp= ar[i];
					ar[i]= ar[j];
					ar[j]= temp;
				}
				
			}
	}
	void show(int[] ar,int n){
		System.out.println("sorted element is..");
		for(int i=0; i<n; i++){
			System.out.println(ar[i]);
		}
	}

} 

class Bubble{
	public static void main(String[] args) {
		BubbySort b = new BubbySort();
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter size of an array...");
		int n=sc.nextInt();
		
		int[] ar= new int[n];
		System.out.println("enter elements..");
		for(int i=0; i<n; i++){
			ar[i]=sc.nextInt();
		}
	
		b.bsort(ar,n);
		b.show(ar,n);
	}

}

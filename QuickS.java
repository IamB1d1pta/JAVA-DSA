import java.util.*;
class Sort{
int partiton(int[] ar, int lb, int ub){
	int pivot= ar[lb];
	int start= ar[lb];
	int end= ar[ub];
	while(end>start){
		while(start<=pivot){
			start++;
		}
		while(pivot>end){
			end--;
		}
		if(start<end){
			swap(ar,start,end);
		}
	}
	swap(ar,pivot,end);
	return end;

}
void quicksort(int[] ar, int lb, int ub){
	if(lb<ub){
		int loc=partiton(ar,lb,ub);
		quicksort(ar,lb,loc-1);
		quicksort(ar,loc+1,ub);
	}

}
void swap(int[] ar, int a, int b){
	int temp;
	temp=ar[a];
	ar[a]=ar[b];
	ar[b]=temp;
}
void show(int[] ar,int n){
	System.out.println("sorted element is..");
	for(int i=0; i<n; i++){
		System.out.println(ar[i]);
	}
}

}

class QuickS{
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size of an array...");
	int n=sc.nextInt();
	int[] ar= new int[n];
	System.out.println("enter elements..");
	for(int i=0; i<n; i++){
		ar[i]=sc.nextInt();
	}
	
	Sort s= new Sort();
	s.quicksort(ar,0,n-1);
	s.show(ar,n);
}
}

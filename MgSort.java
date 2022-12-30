class Merges{
void show(int ar[], int s){
	System.out.println("sorted array is..");
	for(int j=s;j<ar.length;j++){
		System.out.println(ar[j]);
}
}
void divide(int ar[],int s,int e){
	if(s>=e){
		return;
	}
	int mid= s+(e-s)/2;
	divide(ar,s,mid);
	divide(ar,mid+1,e);
	merge(ar,s,mid,e);
}
void merge(int ar[],int s,int mid,int e){
int[] merg= new int[e-s+1];
int i=s;
int j=mid+1;
int k=0;
while(i<=mid&&j<=e){
	if(ar[i]<ar[j]){
		merg[k]=ar[i];
		i++;
		k++;
	}
	if(ar[j]<ar[i]){
		merg[k]=ar[j];
		j++;
		k++;
	}
}
while(i<=mid){
	merg[k]=ar[i];
	i++;
	k++;

}
while(j<=e){
	merg[k]=ar[j];
	j++;
	k++;
}
for(i=0,j=s;i<merg.length;i++,j++){
	ar[j]=merg[i];

}

}
}

class MgSort{

public static void main(String[] args) {
	int ar[]={5,30,2,87,96,42,21,67,100,6};
	int n= ar.length;
	Merges m= new Merges();
	m.divide(ar,0,n-1);
	m.show(ar,0);

}
}
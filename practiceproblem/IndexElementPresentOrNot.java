import java.util.Scanner;

public class IndexElementPresentOrNot {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int n=sc.nextInt();
        int max=0;
        int[] arr1=new int[n+1];
         int[] arr2=new int[n+1];

        System.out.println("Enter elements of  array");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
       
        System.out.println();
        System.out.println("arr: ");
        for(int i=0;i<n;i++)
        {
         System.out.print(arr1[i]+" ");

        }
        
         
        for(int i=0;i<n;i++)
        {   int temp=0;
            for(int j=0;j<n;j++)
            {
                if(i==arr1[j])
                  temp=1;
                
                
            }   
            if(temp==1)
                arr2[i]=i;
            else
                arr2[i]=-1;
    }
    System.out.println();
    for(int i=0;i<n;i++)
        System.out.print(arr2[i]+" ");
    }
    
}

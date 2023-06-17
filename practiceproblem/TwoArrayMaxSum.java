import java.util.Scanner;

public class twoarraymaxsum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int n=sc.nextInt();
        int max=0;
        int[] arr1=new int[n+1];
        int[] arr2=new int[n+1];
        System.out.println("Enter elements of first array");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of second array");
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("arr1: ");
        for(int i=0;i<n;i++)
        {
         System.out.print(arr1[i]+" ");

        }
        System.out.println();
         System.out.println("arr2: ");
        for(int i=0;i<n;i++)
        {
         System.out.print(arr2[i]+" ");

        }
         
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               int  newmax=(arr1[i]+arr2[j]);
                if(newmax>max)
                    max=newmax;
            }

        }
        System.out.println();
        System.out.println("max sum is: "+ max);
    }
    
}

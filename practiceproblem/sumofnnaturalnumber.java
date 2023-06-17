import java.util.Scanner;

public class sumofnnaturalnumber {
    public static void main(String[] args) {
        
    
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int n=sc.nextInt();
        System.out.println("sum is: " +  (n*(n+1))/2);
    }
}

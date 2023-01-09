import java.util.*;
import java.util.Scanner;
class CalculateExpression
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms..");
        int n=sc.nextInt();
        double sum=0,sign=1;
        for(int i=1;i<=n;i++)
        {
            sum=sum+sign*(1/Math.pow(i,2));
            sign=sign*-1;
        }
        System.out.print(sum);

    }
}
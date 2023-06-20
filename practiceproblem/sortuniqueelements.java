import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortuniqueelements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        System.out.println("Enter elements");
        ArrayList<Integer> arr=new ArrayList<Integer>();
       /* for(int i=0;i<size;i++){
            arr.add(sc.nextInt());
        }*/
        
        for(int i=0;i<size;i++)
        {  int n=sc.nextInt();
            if(!arr.contains(n))
                arr.add(n);
        } 
        Collections.sort(arr);
        System.out.println(arr);
       System.out.println(arr.get(2));
        System.out.println(arr.get(2));
       
    }
    
}

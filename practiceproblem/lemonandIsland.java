import java.util.Scanner;

public class lemonandIsland 
    {
        public static void main(String[] args) {
             boolean flag=true;
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
        int five=0,ten=0;
        int[] arr=new int[n];
        
        System.out.println("Enter elements of first array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
                 
          for(int i=0;i<n;i++)
        {
            if(arr[i]==5){
                five++;
            }
            else if (arr[i]==10){
              
                if(five>0){
                    ten++;
                    five--;
                }
                else {
                    flag=false;
                }
            }
                else 
                {
                    
                        if(five>0 && ten>0)
                            {
                                arr[i]=5;
                                five--;
                                ten--;
                            }
                        else if(five>=3)
                        {
                           
                            five-=3;
                        }
                        else {   
                            flag=false;
                        }
                }
            
            
        }
        
        System.out.println(flag);
    }
    
}

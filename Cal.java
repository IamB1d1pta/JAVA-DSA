import java.util.*;
class Cal{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("....................");
			System.out.printf("\n1.Addition \n2.Substruction\n3.Multiplication\n4.Division\n5.Exit\n");
			System.out.println("Enter your choice..");
			int ch = sc.nextInt();
			System.out.println("....................");
			System.out.println("Enter two numbers:");
			int a= sc.nextInt();
			int b= sc.nextInt();
			System.out.println("....................");
			
			switch(ch){
				case 1:
					int add=a+b;
					System.out.println(add);
					break;
				case 2: 
					int sub=a-b;
					System.out.println(sub);
					break;
				case 3:
					int mul=a*b;
					System.out.println(mul);
					break;
				case 4:
					int div=a/b;
					System.out.println(div);
					break;
				case 5: 
					System.exit(0);
				default: System.out.println("Enter valid choice..");		
			}
		}
	}

}
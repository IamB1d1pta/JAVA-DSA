import java.util.Scanner;
public class PrintString {
   public static void main(String[] args){
      String my_str;
      System.out.println("The required packages have been imported ");
      Scanner my_scan = new Scanner(System.in);
      System.out.print("A scanner object has been defined ");
      System.out.print("Enter a string:");
      my_str = my_scan.nextLine();
      System.out.print("The nextLine method is used to read the string");
      System.out.println("The string is: ");
      System.out.println(my_str);
   }
}

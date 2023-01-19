import java.util.*;
class CalenderProblem
{	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the day:");
	int day=sc.nextInt();
	System.out.println("Enter the month:");
	double month=sc.nextInt();
	System.out.println("Enter the year:");
	double year=sc.nextInt();
	double lasttwodigit=year%100;
	double divbyfour=lasttwodigit/4;
	double takemon,takeyear,sum,divbyseven;
	if(month==01)
		takemon=0;
	else if (month==02 ) {
		takemon=3;
	}

	else if (month==03) {
		takemon=3;
	}

	else if (month==04) {
		takemon=6;
	}

	else if (month==05) {
		takemon=1;
	}
	else if (month==06) {
		takemon=4;
	}

	else if (month==07) {
		takemon=5;
	}

	else if (month==8) {
		takemon=2;
	}

	else if (month==9) {
		takemon=5;
	}

	else if (month==10) {
		takemon=0;
	}

	else if (month==11) {
		takemon=3;
	}

	else{
		takemon=5;
	}
	if(year>1600 && year<1699)
	{
		takeyear=6;
	}
	else if(year>1700 && year<1799)
	{
		takeyear=4;
	}

	else if(year>1800 && year<1899)
	{
		takeyear=2;
	}

	else if(year>1900 && year<1999)
	{
		takeyear=0;
	}

	else if(year>2000 && year<2099)
	{
		takeyear=6;
	}
	sum=(lasttwodigit)+(divbyfour)+(day)+(takemon)+(takeyear);
	divbyseven=sum%7;
	System.out.println("The day is:");
	if(divbyseven==0)
	{
		System.out.print("sunday");
	}
	else if(divbyseven==1)
	{
		System.out.print("monday");
	}

	else if(divbyseven==2)
	{
		System.out.print("Tuesday");
	}

	else if(divbyseven==3)
	{
		System.out.print("Wednesday");
	}

	else if(divbyseven==4)
	{
		System.out.print("Thursday");
	}

	else if(divbyseven==5)
	{
		System.out.print("Friday");
	}

	else if(divbyseven==6)
	{
		System.out.print("Saturday");
	}
	}
}
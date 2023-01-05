class Exceptionhanlding
{
	void div(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=(a/b);
		}
		System.out.println(c);
	}
	public static void main(String[] args) {
		Exceptionhanlding h=new Exceptionhanlding();
		t.div(20,10);
	}
	
}
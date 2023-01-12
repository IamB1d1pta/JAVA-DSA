//14 28 20 40 32 64.....
class SequencePrint
{
	public static void main(String[] args) {
		
	int count=14,idx=0;
	for(int i=0;i<15;i++)
	{
		if(i%2==0)
		{	count=count+6*idx;
			System.out.print(count+" ");
			idx++;
		}
		else
		{
			System.out.print(2*count+" ");
		}
	}
}
}

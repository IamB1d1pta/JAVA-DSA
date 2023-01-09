import java.util.StringTokenizer;
public class StringToken{
	public static void main(String args[]) {
		StringTokenizer st=new StringTokenizer("my1name1is1anu");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken("1"));

		}

	}
}

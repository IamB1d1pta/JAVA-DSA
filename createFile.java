import java.io.*;
class createfile
{
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Anubhab\\OneDrive\\Desktop\\filehandling.txt");
		try{
			if(f.createNewfile())
			{
				System.out.print("File sucecssfully craeted...");
			}
			else
			{
				System.out.print("file already exists...");
			}
		}
		catch(IOException h)
		{
			System.out.print("Exception handled");
		}
	}
}
package readcsvfiles;
import java.io.File;
import java.io. FileNotFoundException;
import java.util. Scanner;
public class csvfilereader {
	public static void main(String[] args) throws FileNotFoundException   {
		//Approach1: using Scanner class
		File file=new File("C:\\VS Code\\sample_leads.csv");
		Scanner sc=new Scanner(file);
		sc.useDelimiter(",");
		while(sc.hasNext())
		{

		System.out.print(sc.next()+",");
		}
		sc.close();

		
		}
}

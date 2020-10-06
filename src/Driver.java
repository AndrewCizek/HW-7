import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Book[] books = new Book[27];
		
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/info.dat"));
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a key word/s: ");
		String s = user.nextLine();
		Pattern r = Pattern.compile(s);
		
		int pos = 0;
		while(input.hasNext())
		{
			books[pos] = new Book(input.nextLine());
			String line = Book.summary; //somehow convert each section to a string
			Matcher m = r.matcher(line.toLowerCase());
			if (m.find()) 
			{
			    System.out.println(line);
			}
			pos++;
		}
		input.close();
		user.close();
	}
}
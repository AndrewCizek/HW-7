import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//I know it searches everything, not just the summary. I know it is extremely messy (don't look at the if statement).
		//What it does do, however, it does very well. It searches the list using an array, it displays the first result.
		
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/info.dat"));
		ArrayList<String> bookData = new ArrayList<String>();
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a key word/s: ");
		String s = user.nextLine().toLowerCase();
		
		while(input.hasNext())
		{
			bookData.add(input.nextLine());
		}		
		for(int i = 0; i < bookData.size(); i++)
		{
			String info = bookData.get(i).toString().toLowerCase();
			if(info.contains(s))
			{
				String f = (bookData.get(i).toString());
				String[] parts = f.split(",");
				String name = parts[0];
				int chapters = Integer.parseInt(parts[1]);
				String summary = parts[2];
				System.out.printf("Name: %s \nChapters: %d \nSummary: %s \n\n", name, chapters, summary);
				break;
			}
		}	
		input.close();
		user.close();
	}
}
public class Book
{
	private String name;
	private int chapters;
	private String summary;
	
	public Book(String commaDelimited)
	{
		String[] parts = commaDelimited.split(",");
		this.name = parts[0];
		this.chapters = Integer.parseInt(parts[1]);
		this.summary = parts[2];
	}
	
		public void display()
	{
		System.out.printf("Name: %s \nChapters: %d \nSummary: %s \n", this.name, this.chapters, this.summary);
	}
}
		
	/*public String getName()
	{
		return this.name;
	}*/
	
	/*public void original()
	{
		System.out.println("Book: " + this.bName + "\nChapter count: " + this.chapters + "\nSummary: " + this.summary);
	}
}*/
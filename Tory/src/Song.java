
public class Song 
{
	private String title;
	private String artist;
	private String year;
	private String country;
	
	Song()
	{
	}
	Song(String title, String artist, String year, String country)
	{
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public String show()
	{
		String str = this.year +"�� " +  this.country + "������ " + this.artist + "(��)�� �θ� " + this.title;
		return str;
	}
}

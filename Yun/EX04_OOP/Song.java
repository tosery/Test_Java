
public class Song 
{
	private String title;
	private String artist;
	private int year;
	private String nationality;
	
	public Song() {
		title = "��� ��";
		artist = "�ƹ�";
		year = 1978;
		nationality = "������";
	}
	
	public Song(String title, String artist, int year, String nationality) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.nationality = nationality;
	}

	public void show() {
		System.out.print(year +"�� "); 
		System.out.print(nationality +" ������ "); 
		System.out.print(artist +"�� �θ� "); 
		System.out.println(title +"�Դϴ�."); 
		
	}
	

}

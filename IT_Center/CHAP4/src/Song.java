
public class Song {
	
	//필드 4개
	private String title;
	private String artist;
	private int year;
	private String country;
	
	//기본생성자 
	Song(String title, String artist, int year, String country){
		setSong(title,artist,year,country);
	}
	//매개변수로 모든필드를 초기화하는 생성자
	void setSong(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	
	//메소드
	void show() {
		System.out.println(this.year+"년 "+this.country+"국적의 "+this.artist+"가 부른"+this.title);
	}
	
}

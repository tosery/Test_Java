
public class Song {
	
	//�ʵ� 4��
	private String title;
	private String artist;
	private int year;
	private String country;
	
	//�⺻������ 
	Song(String title, String artist, int year, String country){
		setSong(title,artist,year,country);
	}
	//�Ű������� ����ʵ带 �ʱ�ȭ�ϴ� ������
	void setSong(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	
	//�޼ҵ�
	void show() {
		System.out.println(this.year+"�� "+this.country+"������ "+this.artist+"�� �θ�"+this.title);
	}
	
}

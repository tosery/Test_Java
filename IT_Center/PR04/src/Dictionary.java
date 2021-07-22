import java.util.Scanner;
public class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	
	public Dictionary() {
		
	}
	
	public void run() {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("한글 단어? ");
			String inputword = sc.next();
			if (inputword.equals("그만"))
				break;
			else
				System.out.println(kor2Eng(inputword));
				
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		
		
	}
	
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i]))
				return kor[i] + "은(는) " + eng[i];
		}
		return word + "은(는) 저의 사전에 없습니다.";
		
		
		
	}
}

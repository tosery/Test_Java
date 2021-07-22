import java.util.Scanner;
public class Dictionary {
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	
	public Dictionary() {
		
	}
	
	public void run() {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			String inputword = sc.next();
			if (inputword.equals("�׸�"))
				break;
			else
				System.out.println(kor2Eng(inputword));
				
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}
	
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i]))
				return kor[i] + "��(��) " + eng[i];
		}
		return word + "��(��) ���� ������ �����ϴ�.";
		
		
		
	}
}

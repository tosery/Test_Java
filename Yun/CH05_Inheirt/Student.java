
public class Student extends Person 
{
	//��������� �ϳ��� ����! ������ �θ� ����
	
	public Student() {
		super(99, 30, 175, "ȫ�浿");
	}
	
	void print()
	{
		System.out.print(age +" ");
		System.out.print(name +" ");
		System.out.print(height +" ");
		System.out.println(getWeight() +" ");
	}
	
	
	public void set() {
		age = 30; // ���� Ŭ������ ����Ʈ ��� ���� ����
		name = "ȫ�浿"; // ���� Ŭ������ public ��� ���� ����
		height = 175; // ���� Ŭ������ protected ��� ���� ����
		// weight = 99; // ����. ���� Ŭ������ private ���� �Ұ�
		setWeight(99); // private ��� weight�� setWeight()���� ���� ����
	}

}

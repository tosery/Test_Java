
//1.Ŭ���� �����
public class Person {
	//���� �� �������� 3����
	//��������
	private String name;
	private int age;
	private double height;
	
	//������� (�޼ҵ�)
	public Person()
	{
		System.out.println("���� ������!");
	}
	
	//��޼ҵ�
	public int addAge1(int plus)
	{
		age = age + plus;
		return age;
	}
	
	public void addAge2(int plus)
	{
		age = age + plus;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name1)
	{
		name = name1;
	}
	
	public void setAge(int age1)
	{
		age = age1;
		printAge();
	}
	
	private void printAge()
	{
		System.out.println("��ü ���� ���->"+age);
	}
}
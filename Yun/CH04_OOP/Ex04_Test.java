public class Ex04_Test 
{
	public static void main(String[] args) 
	{
		//2.Ŭ���� ���, 3.��ü �����
		Person p1 = new Person();
		
		//4.��ü ���(�������� or ��޼ҵ�)
		//��������
//		p1.name = "ȫ�浿";//������� ���� ����
//		p1.age = 20;//������� ���� ����
		p1.setName("ȫ�浿");
		p1.setAge(20);
		
		//System.out.println(p1.name +"�� ���̴�"+p1.age);
		System.out.println(p1.getName() +"�� ���̴�"+p1.getAge());
		
		//��޼ҵ�
		int realAge1 = p1.addAge1(3);
		System.out.println("��¥ ���̴�=>"+realAge1);

		p1.addAge2(5);
//		System.out.println("��¥ ���̴�=>"+p1.age);//�⺯ ���� ����
		System.out.println("��¥ ���̴�=>"+p1.getAge());
		
	}
}




public class OverringEX 
{
	public void run() 
	{
		Weapon weapon;
		
		weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ��� " + weapon.fire());
	}
}

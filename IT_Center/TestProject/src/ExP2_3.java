import java.lang.invoke.ConstantBootstraps;
import java.util.Scanner;
public class ExP2_3 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		final int num2 = number;
		int oman;
		int ilman;
		int ilcheon;
		int obak;
		int ilbak;
		int oship;
		int ship;
		
		oman = num2/50000;
		ilman = (num2-(oman*50000))/10000;
		ilcheon = (num2-oman*50000-ilman*10000)/1000;
		obak = (num2-oman*50000-ilman*10000-ilcheon*1000)/500;
		ilbak = (num2-oman*50000-ilman*10000-ilcheon*1000-obak*500)/100;
		oship = (num2-oman*50000-ilman*10000-ilcheon*1000-obak*500-ilbak*100)/50;
		ship = (num2-oman*50000-ilman*10000-ilcheon*1000-obak*500-ilbak*100-oship*50)/10;
		System.out.println("오만원 권: "+(int)Math.floor(oman)+"매");
		System.out.println("만원 권: "+(int)Math.floor(ilman)+"매");
		System.out.println("천원 권: "+(int)Math.floor(ilcheon)+"매");
		System.out.println("오백원: "+(int)Math.floor(obak)+"개");
		System.out.println("백원: "+(int)Math.floor(ilbak)+"개");
		System.out.println("오십원: "+(int)Math.floor(oship)+"개");
		System.out.println("십원: "+(int)Math.floor(ship)+"개");
	}

}

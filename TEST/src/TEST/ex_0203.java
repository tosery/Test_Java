package TEST;
import java.io.*;
public class ex_0203 {

	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		try
		{
			while (true)
			{
				int a = rd.read();
				if(a==-1)
					break;
				System.out.println((char)a);
			}
		}
		catch (IOException e)
		{
			System.out.println("입력 에러 발생");
		}
	}

}

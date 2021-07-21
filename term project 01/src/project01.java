import java.io.FileInputStream;
public class project01 {

	public static void main(String[] args) throws Exception
	{
		System.setIn(new FileInputStream("src/inputFile.txt"));
	}

}

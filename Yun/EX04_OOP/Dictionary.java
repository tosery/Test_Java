
public class Dictionary 
{
	private static String kor[] = {"���","�Ʊ�","��","�̷�","���"};
	private static String eng[] = {"love","baby","money","future","hope"};

	public static String kor2Eng(String kor1) 
	{
		for(int i=0; i<kor.length; ++i)
		{
//			if(kor1.equals(kor[i]))
			if(kor[i].equals(kor1))
			{
//				String eng1 = eng[i];
//				return eng1;
				return eng[i];
			}
		}
		
		return "";
	}
	
}

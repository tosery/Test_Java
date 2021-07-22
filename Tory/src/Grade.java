
public class Grade 
{
	private int math;
	private int science;
	private int english;
	
	Grade()
	{
		
	}
	Grade(int ma, int sc, int en)
	{
		this.math = ma;
		this.science = sc;
		this.english = en;
	}
	public int average()
	{
		int avg = (math + science + english)/3;
		return avg;
	}
}

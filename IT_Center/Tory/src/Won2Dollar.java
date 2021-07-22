
public class Won2Dollar extends Converter
{	
	private double num;
	
	public Won2Dollar()
	{
	}
	
	public Won2Dollar(int r)
	{
		this.ratio = r;
	}
	
	@Override
	public double convert(double src)
	{
		this.num = src/this.ratio;
		return num;
	}

	@Override
	protected String srcString()
	{
		return "¿ø";
	}

	@Override
	protected String destString() 
	{
		return "´Þ·¯";
	}
	
}

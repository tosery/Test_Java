
public class Km2Mile extends Converter
{
	private double num;
	
	public Km2Mile()
	{
	}
	
	public Km2Mile(double r)
	{
		this.ratio = r;
	}
	
	@Override
	protected double convert(double src) 
	{
		this.num = src/this.ratio;
		return num;
	}

	@Override
	protected String srcString() 
	{
		return "Km";
	}

	@Override
	protected String destString() 
	{
		return "Mile";
	}
}

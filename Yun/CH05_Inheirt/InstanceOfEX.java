
public class InstanceOfEX 
{
	public void run()
	{
		System.out.print("new Student() ->\t"); 
		print(new Student());
		System.out.print("new Researcher() ->\t"); 
		print(new Researcher());
		System.out.print("new Professor() ->\t"); 
		print(new Professor());
	}
	
	private void print(Person p) 
	{
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
}

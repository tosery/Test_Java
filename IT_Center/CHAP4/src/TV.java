
public class TV {
	
	private String company;
	private int inYear;
	private int inch;
	
	TV(String company, int inYear, int inch){
		this.company = company;
		this.inYear = inYear;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(this.company + "에서 만든" + this.inYear + "년형 " + this.inch +"인치 TV");
	}
}

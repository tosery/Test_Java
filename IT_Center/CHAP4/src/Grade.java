
public class Grade {
	private int math;
	private int science;
	private int english;
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		int avg = 0;
		avg = (this.math + this.science + this.english) / 3; 
		return avg;
	}
}

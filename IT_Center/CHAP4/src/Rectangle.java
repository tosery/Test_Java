
public class Rectangle {
	//필드
	private int x;
	private int y;
	private int width;
	private int height;
	
	//생성자			(x,y)에서 크기가 width*height인 사각형
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//메소드
	public int square() {		//사각형의 넓이
		int sqr = this.width * this.height;
		return sqr;
	}
	
	public void show() {		//사각형의 좌표와 넓이를 화면에 출력
		System.out.println("("+this.x+","+this.y+")에서 크기가 "+this.width+"x"+this.height+"인 사각형");
	}
	
	public boolean contains(Rectangle r) {		//r이 현 사각형 안에 있으면 true 리턴
		if(this.x < r.x && (this.x+this.width) > r.x && (this.x+this.width) > (r.x+r.width)) {
			if(this.y < r.y && (this.y+this.height) > r.y && (this.y+this.height) > (r.y+r.height))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
}


public class TV 
{
	private int size;
	public TV(int size) {this.size = size;}//생성자
	protected int getSize() {return size;}//이걸로 ColorTV에서 간접 접근 가능
}

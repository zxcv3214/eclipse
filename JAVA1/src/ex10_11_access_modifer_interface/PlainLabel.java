package ex10_11_access_modifer_interface;
//인터페이스의 메소드를 오버라이딩시 반드시 public을 붙여야한다.
public class PlainLabel implements Movable {
	int x, y;
	String str;
	public PlainLabel(int x, int y, String str) {
		this.x= x;
		this.y= y;
		this.str=str;
	}
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
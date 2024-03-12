package ex13_5;

public class Rectangle {
	int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		String result = "가로는" + width + ", 세로는 " + height;
		return result;
	}
	public boolean equals(Object obj) {
		
			if(obj !=null && obj instanceof Rectangle) {
				Rectangle r = (Rectangle)obj;
				return this.width == r.width && this.height == r.height;
			}else {
				return false;
			}
		}
}

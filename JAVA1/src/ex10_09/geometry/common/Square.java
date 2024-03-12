package ex10_09.geometry.common ;

import ex10_09.geometry.shape.Polygon;

public class Square extends Polygon{

	public Square(int x, int y,int size) {
		super(4);					//슈퍼 클래스의 prorercted 생성자 호출
		setPoint(0, x, y);			//슈퍼 클래스의 prorercted 메소드 호출
		setPoint(1, x + size, y);
		setPoint(2, x+size , y+size);
		setPoint(3, x, y+size);
	}
	
	public int getX(int index) {
		
		return x[index];
		
	}
	
	public int getY(int index) {
		
		return y[index];
	}
}
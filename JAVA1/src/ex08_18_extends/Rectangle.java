package ex08_18_extends;

public class Rectangle implements Transformable  {

	int x,y,width,height;
	
	Rectangle(int x,int y, int width, int height){
		this.x= x;
		this.y= y;
		this.height=height;
		this.width=width;
	}

	@Override
	public void resize(int width, int height) {
		// 기능) 두 개의 매개변수를 이용해 필드 초기화 
		this.width=width;
		this.height=height;
	}
	
	@Override
	public void moveTo(int x, int y) {
		// 기능) 두 개의 매개변수를 이용해 필드 초기화 
		this.x=x;
		this.y=y;
	}

	@Override
	public void moveBy(int xOffset, int yOffset) {
		// 기능) 기존 x값에 xOffset을 더해 x를 구한다.
		// 기존 y값에 yOffset을 더해 y를 구한다.
		this.width+=xOffset;
		this.height+=yOffset;
	}

	

}

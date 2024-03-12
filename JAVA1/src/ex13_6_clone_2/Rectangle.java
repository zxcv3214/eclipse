//복제 가능한 클래스로 만들기
//1단계 - Cloneable 인터페이스 구현
//2단계 - clone() 메소드 오버라이드하기

package ex13_6_clone_2;



//Cloneable 인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미입니다.
public class Rectangle implements Cloneable {
	int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/* 공변 반환 타입(covariant return type) - JDK1.5부터 적용
	 * 오버라이딩할 때 조상 메소드의 반환타입을 자손 클래스의 타입으로 변경을 허용하는 것이다.
	 * 즉, 변환형을 object에서 자속 클래스 타입으로 변경을 허용합니다.
	 * 
	 * 좋은점 : clone()호출 후 형 변환이 필요 없습니다.(main 메소드)
	 * 		Rectangle obj2 = (Rectangle) obj1.clone();
	 * 		Rectangle obj2 = obj1.clone();
	 * 
	 * */
	public Rectangle clone() {//반환형이 Object형 입니다.
		try {
			//슈퍼 클래스의 clone메소드를 호출해서 그 결과를 리턴
			return (Rectangle) super.clone(); //변경된 곳 : Rectangle형으로 변환합니다
			
		}
		//수퍼 클래스의 clone메소드가 발생하는 익셉션을 처리
		catch (CloneNotSupportedException e) {
			return null;
		}
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
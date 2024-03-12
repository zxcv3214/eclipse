package ex13_6_clone_2_1_shallow;
public class Circle implements Cloneable {
	Point p;
	double r;
	
	public Circle(Point p, double r) {
		this.p=p;
		this.r=r;
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
	public Circle clone() {//반환형이 Object형 입니다.
		try {
			//슈퍼 클래스의 clone메소드를 호출해서 그 결과를 리턴
			return (Circle) super.clone(); //조상의 clone()을 호출한다
			
		}
		//수퍼 클래스의 clone메소드가 발생하는 익셉션을 처리
		catch (CloneNotSupportedException e) {
			System.out.println("복제 오류 발생했습니다.");
			return null;
		}
	}
	public String toString() {
		return "[p=" + p + ", r=" + r + "]" ;
	}
}
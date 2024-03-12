/*정적 필드가 있는 클래스
 * total 필드는 객채마다 따로 생기지만
 * grandTotal 필드는 특정 객체에 상관없음
 * */
package ex07_15_static_method;
public class FieldExamle1_method {
	public static void main(String args[]) {
		Circle obj = new Circle(3.5);
		print(obj);
		
		obj.radius = 5.5;
		FieldExamle1_method.print(obj);
	 }
	public static void print(Circle circle) {
		//double area = circle.getArea();
		System.out.println("원의 반지름 = " + circle.radius);
		System.out.println("원의 넒이 = " + circle.getArea());
	}
}

package ex09_02_null;

public class RefTypeExample2 {
	public static void main(String args[]) {
		Point obj = null;//아무 데이터도 가리키지 않는 참조값
		System.out.println(obj.x);
		//java.lang.NullPointerException
		System.out.println(obj.y);
	}
}

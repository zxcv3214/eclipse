package ex09_13_Test2.answer3;
public class InterfaceExample1 {

	public static void main(String[] args) {
		SeparateVolume obj = new SeparateVolume("863", "나무", "베르베르");
	
	//대출가능을 확인하고 대출상태가 가능하면 "대출가능"을 출력하고
	//대출중이면 대출중과 대출인,대출일을 출력합니다.
	printState(obj);
	
	obj.checkOut("홍길동","2024-01-09");
	
	printState(obj);
	}
	
	static void printState(SeparateVolume obj) {
		
		if(obj.state == BookState.STATE_NORMAL) {
			System.out.println("---------------");
			System.out.println("대출상태: " + BookState.STATE_NORMAL.value());
			System.out.println("---------------");
			
		}else if(obj.state == BookState.STATE_BORROWED){
			System.out.println("---------------");
			System.out.println("대출상태: " + BookState.STATE_BORROWED.value());
			System.out.println("대출인:" + obj.borrower);
			System.out.println("대출일:" + obj.checkOutDate);
			System.out.println("---------------");
		}
		
	}
}
package ex08_15_01_inerface_polymorphism;


public class AppCDInfo extends CDInfo implements Lendable {
	
	String borrower;	//대출인
	String checkOutDate;//대출일
	byte state;			//대출상태
	String writer;
	
	AppCDInfo (String registerNo, String title, String writer) {
		super(registerNo, title);
		this.writer=writer;
	}
	
	//public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	//대출한다
	@Override
	public void checkOut(String borrower, String date) {
		if(state != 0) {
			return;
		}else {
			this.borrower=borrower;
			this.checkOutDate=date;
			this.state=1; //대출상대 : state=1;
			System.out.println("*" + title + " CD가 대출되었습니다.");
			System.out.println("저 자:"+ writer);
            System.out.println("대출인:" + borrower);
            System.out.println("대출일:" + date + "\n");   
		}
	}
	//반납한다
	@Override
	public void checkIn() {
		if(state != 1) {
			this.borrower= null;
			this.checkOutDate = null;
			this.state =0 ;
		}else {
		System.out.println("*" + title + " CD가 반납되었습니다.\n");
		}
	}
}

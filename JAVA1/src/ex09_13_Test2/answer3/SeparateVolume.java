package ex09_13_Test2.answer3;

public class SeparateVolume implements Lendble{

	String requestNo;   //청구번호
	String bookTitle;   //제목
	String writer;      //저자
	String borrower;    //대출인
	String checkOutDate;//대출일
	BookState state;    
	
	SeparateVolume(String requestNo, String bookTitle, String writer){
		this.requestNo=requestNo; //청구번호
		this.bookTitle=bookTitle; //제목
		this.writer=writer;       //저자
		this.state = BookState.STATE_NORMAL;
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		if(state != BookState.STATE_NORMAL) { //STATE_NORMAL=0(대출되지 않는 상태)
			return;
		}else {
			this.borrower=borrower;
			this.checkOutDate=date;
			this.state=BookState.STATE_BORROWED;//STATE_NORMAL=1(대출중)
			System.out.println("*"+ bookTitle + "이(가) 대출되었습니다");
			System.out.println("저 자 :" + writer);//저자 추가
			System.out.println("대출인:" +borrower);
			System.out.println("대출일:" + date + "\n");
		}
	}
	@Override
	public void checkIn() { 
		if(state != BookState.STATE_BORROWED) {
			this.borrower= null;
			this.checkOutDate = null;
			this.state =BookState.STATE_NORMAL; //STATE_BORROWED(대출중)
		}else {
			System.out.println("*"+ bookTitle + "이(가) 반납되었습니다.");
		}
	}
}

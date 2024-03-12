package ex08_16_interface_constant;

interface Lendable {
	final static byte STATE_BORROWED = 1;
	final static byte STATE_NORMAL = 0;
	//대출 메소드
	void checkOut(String borrower, String date);
	//반납 메소드
	void checkIn();
	
}

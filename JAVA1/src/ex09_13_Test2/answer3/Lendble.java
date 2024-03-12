package ex09_13_Test2.answer3;
interface Lendble {
	 /*final static byte STATE_BORROWED = 1; 대출 중
	  * final static byte STATE_NORMAL = 0; 대출되지 않은 상태
	  * */
	//대출한다.
	 void checkOut(String borrower, String date); 
	//반납한다.
	 void checkIn();
}

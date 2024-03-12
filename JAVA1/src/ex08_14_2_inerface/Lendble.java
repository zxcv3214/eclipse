package ex08_14_2_inerface;

interface Lendble {
	 
	//대출한다.
	public abstract void checkOut(String borrower, String date); 
	//반납한다.
	public abstract void checkIn();
}

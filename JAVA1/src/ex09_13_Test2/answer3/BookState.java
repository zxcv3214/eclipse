package ex09_13_Test2.answer3;

enum BookState {
	STATE_NORMAL("대출 가능"), STATE_BORROWED("대출 중");
	private final String check;
	
	private BookState(String check) {
		this.check=check;
	}
	String value() {
		return check;
	}
}
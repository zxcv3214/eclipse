package ex08_09_abstract_method;

class InheritanceExample1 {

	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender("생일을 축하합니다.", "고객센터",
										   "admin@khshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
	//추상 메소드를 구현한 메소드를 호출
		obj1.serndMessage("hoho@naver.com");
		
		SMSSender obj2= new SMSSender("생일을 축하합니다.", "고객센터",
				 					  "064-123-45675", "10% 할인쿠폰이 발행되었습니다.");
		obj2.serndMessage("010-7777-7777");
		
	}
}
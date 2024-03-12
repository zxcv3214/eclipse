package ex08_09_abstract_method;

abstract public class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title, String senderName){ //생성자
		this.title=title;
		this.senderName=senderName;
	}
	//추상 메서드 메시지 전송
	abstract void serndMessage(String recipient);
	

}

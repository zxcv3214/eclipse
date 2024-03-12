package ex17_12_notify_wait;

public class SharedArea {
	private double result;
	
	SharedArea() { //기본생성자
		
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	//공유 데이터가 쓰여졌는지 여부를 표현하는 필드-디폴트(false)
	private boolean isReady;
	
	//SharedArea 클래스에 isReady 변수를 선언해준다.
	public boolean isReady() {
		return isReady;
	}
		public void setReady(boolean isReady) {
			this.isReady=isReady;
		}
}

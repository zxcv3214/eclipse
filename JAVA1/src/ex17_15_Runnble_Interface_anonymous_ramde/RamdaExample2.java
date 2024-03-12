package ex17_15_Runnble_Interface_anonymous_ramde;

public class RamdaExample2 {
	public static void main(String args[]) {
	print(new Sample() {
		@Override
		public void print() {
			System.out.println("new Sample - 1");	
		}
	});
	print(() -> System.out.println("new Sample - 2"));
	
	//실행문이 하나 있는 경우 중괄호 생략하면 세미콜론을 생략합니다.
	print(() -> System.out.println("new Sample - 3"));
	}
	
	static void print(Sample sample) {
		sample.print();
	}
	
}
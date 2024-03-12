package ex07_17_Singleton;

 public class Singleton_main {
	public static void main(String[] args) {
		/* 에러 발생 private : 외부에서 생성자를 호출할 수 없다.
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
	
 }
 
	

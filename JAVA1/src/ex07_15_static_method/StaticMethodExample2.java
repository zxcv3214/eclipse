/*정적 필드가 있는 클래스
 * total 필드는 객채마다 따로 생기지만
 * grandTotal 필드는 특정 객체에 상관없음
 * */
package ex07_15_static_method;
public class StaticMethodExample2 {
	public static void main(String args[]) {
		//정적 메서드 호출문
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("총계 = " + grandTotal);
		Accumulator sum1= new Accumulator();
		Accumulator sum2= new Accumulator();
		sum1.accymylate(10);
		sum2.accymylate(20);
		
		//정적 메서드 호출문
		grandTotal = Accumulator.getGrandTotal();
		
		//인스턴스 메소드로 인스턴스 객체를 생성해야한다.
		
		
		//인스턴스 메서드 print()를 정적 메서드인 main()에서 호출할 수 없다.
		print(sum1);
		print(sum2);// 이 메서드를 사용하기 위해서는?
		System.out.println("총계 = " + grandTotal);
	}//main() end
	  
	
		void print(Accumulator a) {
			System.out.println("total = " + a.total);
	
	 }//print end
}

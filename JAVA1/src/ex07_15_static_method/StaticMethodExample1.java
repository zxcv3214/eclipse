/*정적 필드가 있는 클래스
 * total 필드는 객채마다 따로 생기지만
 * grandTotal 필드는 특정 객체에 상관없음
 * */
package ex07_15_static_method;
public class StaticMethodExample1 {
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
		System.out.println("sum1.total = " + sum1.total);
		System.out.println("sum2.total = " + sum2.total);
		System.out.println("총계 = " + grandTotal);
	}
}

package ex07_13_static_fied1;

public class StaticFieldExample1 {
	public static void main(String args[]) {
		System.out.println("정적변수 grandTotal = " + Accumulator.grandTotal);
		
		Accumulator sum1= new Accumulator();
		sum1.accymylate(10);
		System.out.println("sum1.total = "+sum1.total);
		System.out.println("sum1.grandTotal = "+sum1.grandTotal);
		System.out.println("Accumulator.grandTotal = "+Accumulator.grandTotal);
		
		Accumulator sum2= new Accumulator();
		sum2.accymylate(20);
		System.out.println("=========================================");
		System.out.println("sum2.total = " + sum2.total);
		System.out.println("sum2.grandTotal"+sum2.grandTotal);
		System.out.println("Accumulator.grandTotal =" + Accumulator.grandTotal);
	}
}

package ex04_11_conditional1_op;

public class ConditionalOpExample1 {

	public static void main(String[] args) {
		int a =30, b = 10, max, min;
		System.out.println(a > b ? a : b);
		
		max = a > b ? a : b;
		System.out.println("최댓값 =" + max);
		
		min = a < b ? a : b;
		System.out.println("최소값 =" + min);
	}

}

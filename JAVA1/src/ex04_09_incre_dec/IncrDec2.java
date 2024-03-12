//증가 연산자, 감소 연산자
package ex04_09_incre_dec;

public class IncrDec2 {

	public static void main(String[] args) {
		int n1=10, n2=10, n3=10, n4=10;
		//n1= n1 +1;
		//System.out.println(n1);
		System.out.println(++n1); //11
		
		System.out.println(n1); //11
		
		//System.out.println(n2);
		//n2= n2+1;
		System.out.println(n2++); //10
		
		System.out.println(n2); //11
		
		System.out.println(--n3);//9
		System.out.println(n3);//9
		
		System.out.println(n4--);//10
		System.out.println(n4);//9
	}
}

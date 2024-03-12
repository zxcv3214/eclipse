package ex04_12_eomAssign;

public class CompAssignmentExample1 {

	public static void main(String[] args) {
		int res=10, a=2;
		res += a; //res= +a;
		System.out.println(res);//10 + 2 = 12
		
		res -= a; //res= res-a;
		System.out.println(res);//12-2 = 10
		
		res *= a; //res= res*a;
		System.out.println(res);//10*2 = 20
		
		res /= a; //res= res/a;
		System.out.println(res);//20/2 = 10
		
		int num=29;
		num-= 2 + 3 * 4 ;//29-(2+3*4)
		System.out.println(num);

	}

}

package ex05_3_while;

public class WhileExample2_loop3 {
	public static void main(String args[]) {
		//1~10까지 합
		
		int cnt=0 , sum=0;
		
		while (cnt<=10) {
			sum= sum+cnt;
			cnt=cnt+1;
		}
		System.out.println("1~10까지 합="+sum);
		
		//1~10까지 짝수 합
		
		int cnt1=0 , sum1=0;
		while (cnt1<11) {
			sum1= sum1+cnt1;
			cnt1+= 2;
		}
		System.out.println("짝수 합="+sum1);
		
		//1~10까지 홀수 합
		int cnt2=1, sum2=0;
		while (cnt2<11) {
			sum2= sum2+cnt2;
			cnt2+= 2;
		}
		System.out.println("홀수 합="+sum2);
	}
}


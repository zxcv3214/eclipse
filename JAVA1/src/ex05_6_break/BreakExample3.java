package ex05_6_break;

public class BreakExample3 {

	/*레이블 블록
	 * 형식) 레이블 명 : {문장블록} 또는 반복문이 포함된 블록
	 * 예) 
	 * aa:{
	 * System.out.println("aa");
	 * }
	 * 
	 * bb:for(int i=0; i<10; i++) {
	 * break bb;
	 * }
	 * */
	
	public static void main(String[] args) {
	
		outerLoop:
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=4; j++) {
				System.out.println("("+i+","+j+")");
				if ((i == 1) && (j==2)) {
					break outerLoop; //outerLoop 블럭문을 벗어납니다.
				}
			}
		}
		
		System.out.println("End");
	}

}

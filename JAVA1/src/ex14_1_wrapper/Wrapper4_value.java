package ex14_1_wrapper;

public class Wrapper4_value {

	public static void main(String[] args) {
		int total = 0;
		for (int cnt=0; cnt< args.length; cnt++) {
			total = args[cnt] _ total;
			//에러발생 (String -> int 형변환 요구)
		}
		System.out.println(total);
	}

}

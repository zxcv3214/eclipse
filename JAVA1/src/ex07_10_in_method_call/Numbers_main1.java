package ex07_10_in_method_call;

public class Numbers_main1 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		Numbers sum= new Numbers(arr);
		sum.grandTotalprint(sum);
		
	}
	//static에 메모리가 올라가지 않았다.
	//static을 쓰지않고 어떻게 메모리로 올릴수 있을까?
	
	  void print(Numbers sum) {
		System.out.println("합계 =" + sum.getTotal());
		System.out.println("평균 =" + sum.getAverage());
		
	}

}

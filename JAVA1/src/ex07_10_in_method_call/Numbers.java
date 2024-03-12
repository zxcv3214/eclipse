package ex07_10_in_method_call;

public class Numbers {
	//필드
	private  int num[];
	//생성자
	Numbers(int num[]){
		this.num= num;
	}
	//총점 메서드
	  int getTotal() {
   	 	int sum =0;
   	 	/*
   	 	for(int i=0; i<num.length;i++)
   	 	*/
   	 	for(int i : num) {
   	 	sum= sum+i;
   	 	}
		return sum;
    }
    //평균 메서드
      int getAverage(){
   	 return getTotal()/num.length;
	}

}

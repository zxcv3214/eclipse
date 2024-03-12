package ex07_16_static_init;

public class StaticIntializerExample2 {

	public static void main(String[] args) {
		System.out.println("main 실행시작");
		HnudredNumbers h= new HnudredNumbers();
		HnudredNumbers h2= new HnudredNumbers();
		
		//배열에 있는 항목들 중 3개의 항목을 가져와서 그 값을 출력한다.
		System.out.println(HnudredNumbers.arr[35]);
		System.out.println(HnudredNumbers.arr[27]);
		System.out.println(HnudredNumbers.arr[63]);

	}

	//인스턴스를 생성하기 위해서 클래스 생성 메모리 문장이 로드된다.
}

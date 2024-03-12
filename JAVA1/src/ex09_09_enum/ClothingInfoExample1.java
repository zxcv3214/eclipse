//사계절을 표현하는 코드 값을 상수로 선언해서 사용하는 예
//의류 정보 클래스
package ex09_09_enum;
class ClothingInfoExample1 {
	public static void main(String[] args) {
		//ClothingInfo.SUMMER : ClothingInfo클래스에 선언된 상수 필드를 사용
	ClothingInfo obj = new ClothingInfo("32919","반판 티셔츠",
										"면100%",  Season.SUMMER);
		
		System.out.println("상품코드: " + obj.code);
		System.out.println("상품명: " + obj.name);
		System.out.println("소재: " + obj.marterial);
		System.out.println("계절구분: " + obj.season);
	}
}
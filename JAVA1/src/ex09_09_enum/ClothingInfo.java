//사계절을 표현하는 코드 값을 상수로 선언해서 사용하는 예
//의류 정보 클래스
package ex09_09_enum;
class ClothingInfo {
	String code;
	String name;
	String marterial;
	Season season;
	
	
	
	public ClothingInfo(String code, String name,
						String marterial,Season season) {
		this.code = code;
		this.name = name;
		this.marterial = marterial;
		this.season = season;//주석 풀면?
		//this.season = 5; (컴파일 에러 발생)
				
	}
}
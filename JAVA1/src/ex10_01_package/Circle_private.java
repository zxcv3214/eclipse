package ex10_01_package;

class Circle_private {
	int radius;
	
	Circle_private(int radius) {
		this.radius =radius;
	}
	double getArea() {
		return radius * radius * 3.14;
		
	}
}
/*
 * public 접근 제한 없음
 * protected - 같은 패키지 내에서 그리고 다른 패키지, 자손 클래스까지 접근가능
 * default - 같은 패키지 내에서만 접근 가능
 * private - 같은 클래스 내에서만 접근 가능
 * */

package test00;

public class TV {
	//TV에 속성(맴버변수)
	String color;	//색상
	boolean power;	//전원상태(on/off)
	int channel;	//채널

	//Tv기능
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
	int add (int a, int b) {
		return a+b;
	}
	
}

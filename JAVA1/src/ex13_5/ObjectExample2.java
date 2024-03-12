package ex13_5;

public class ObjectExample2 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,30);
		Rectangle r2 = new Rectangle(10, 30);
		
		System.out.println(r1.width+","+r1.height);
		System.out.println(r2.width+","+r2.height);
		
		//System.out.println(obj1.toString()); 
		//System.out.println(obj2.toString());
		
		if(r1==r2) //주소를 비교하고 있다.
			System.out.println("r1==r2 : 같음");
		else 
			System.out.println("r1==r2 : 다름");
		
		if (r1.equals(r2))//주소안에 있는 값을 비교한다.
			System.out.println("r1.equals(r2): 같음");
		else {
			System.out.println("r1.equals(r2): 다름");
		}

	}

}

package ex10_09.main;

import ex10_09.geometry.common.Square;

public class AccessControlExample {

	public static void main(String[] args) {
		Square obj = new Square(100,200,15);
		
		System.out.println("X[0]=" +obj.getX(0)+ "," +"Y[0]="+ obj.getY(0));
		System.out.println("X[1]=" +obj.getX(1)+ "," +"Y[1]="+ obj.getY(1));
		System.out.println("X[2]=" +obj.getX(2)+ "," +"Y[2]="+ obj.getY(2));
		System.out.println("X[3]=" +obj.getX(3)+ "," +"Y[3]="+ obj.getY(3));
		
		System.out.println("("+obj.getX(0)+ "," +obj.getY(0)+")");
		System.out.println("("+obj.getX(1)+ "," +obj.getY(1)+")");
		System.out.println("("+obj.getX(2)+ "," +obj.getY(2)+")");
		System.out.println("("+obj.getX(3)+ "," +obj.getY(3)+")");
		
		for (int i=0; i<obj.x.length; i++) {
			int x= obj.getX(i);
			int y= obj.getY(i);
		System.out.println("X["+i+"]=" +x+ "," +"Y["+i+"]="+y);
		}
	}	
}
package ex10_09.geometry.shape;

public class Polygon {
	public int x[];
	protected int y[];

	
	protected Polygon(int size) {
		x = new int[size];
		y = new int[size];

	}
	
	protected void setPoint(int index, int x, int y) {
		this.x[index] = x;
		this.y[index] = y;
	}
}

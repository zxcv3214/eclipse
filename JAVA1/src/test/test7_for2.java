package test;

public class test7_for2 {
	public static void main(String[] args) {
	
		int line=5; //숫자로 트리 크기 설정
		
		System.out.println("트리");
		String tree="*";
	for(int i=1; i<line; i++) {
		for(int j=(line-1)-i; j>0; j--) {
			System.out.print(" ");
			}
	System.out.println(tree);
	tree+="**";
		}
	}
}

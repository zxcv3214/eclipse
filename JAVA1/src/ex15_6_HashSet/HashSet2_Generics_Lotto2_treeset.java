package ex15_6_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet2_Generics_Lotto2_treeset {

	public static void main(String[] args) {
		
//		int lotto[] = new int[6]; // 로또 번호를 입력받을 배열을 선언해준다.
//
//		System.out.print("로또 번호 : ");
//		for (int i = 0; i < lotto.length; i++) {
//			int num = (int) (Math.random() * 45) + 1; // 1~46까지의 임의의 수를 받는다.
//			lotto[i] = num;
//			for (int j = 0; j < i; j++) { // 중복된 번호가 있으면 이전 포문으로 돌아가 다시 시행한다.
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//			System.out.print(lotto[i] + ", "); // 로또번호를 출력한다.
//		}
		TreeSet<Integer> set =new TreeSet<Integer>();
		
		while (set.size()<6) {
			int num = (int) (Math.random()*45 +1);
			set.add(num);
		}
		System.out.println(set);
		
		//TreeSet을 배열로 변환
		Integer[] array= set.toArray(new Integer[set.size()]);
		
		//배열 출력
		System.out.println(Arrays.toString(array));
	}
	
}
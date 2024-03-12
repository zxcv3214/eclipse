package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest3_addAll {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(10);
		list1.add("봄");
		list1.add("여름");

		ArrayList<String> list2 = new ArrayList<>(10);
		list2.add("봄");
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");
		//list2에서 list1과 공통되는 요소들을 찾아 삭제
		for(int i=0; i<list2.size();i++) {
			//list1에 list2.get(i)가 포함되어 있는지 확인
			if(list1.contains(list2.get(i))) {
				//list2.remove(i);
				list2.remove(i--);
				//i--를 통해 중복된 데이터를 다시 for를 통해 확인한다.
				System.out.println(list2);
			}
			
		}
		System.out.println("=========삭제후=========");
		System.out.println(list1);
		System.out.println(list2);
	}
}

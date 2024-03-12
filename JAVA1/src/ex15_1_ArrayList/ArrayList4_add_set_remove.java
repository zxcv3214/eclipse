/* 1.지네릭스(Generics) jdk 1.5에서 처음 도입
 *		다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시 타입체크를 해주는 기능입니다.
 *
 * 2. 클래스 옆에 꺽쇠(<>)기호를 이용해서 만듭니다.
 * 		1) <>안에 특정 자료형(Wrapper 클래스, String, 사용자 정의 클래스형-참조형)을 넣어주면 됩니다.
 * 		2) API 형식 표기
 * 			Class ArrayList<E> : E의 ArrayList라고 읽습니다.
 * 			- ArrayList : 원시 타입(raw type)
 * 			- E(타입 매개 변수) : 기호의 종류만 다를 뿐 임의의 참조형 타입을 의미합니다.
 * 
 * 	타입 매개 변수 : 의미
 * 				E	: 원소(Element)
 * 				K	: 키(Key)
 * 				T	: 타입(Type)
 * 				V	: 값(Value)
 * 
 * - 사용 예)
 * 			List<String>		list = new ArrayList<String>();
 * 			ArrayList<String>	list = new ArrayList<String>();
 * 			ArrayList<Integer>	list = new ArrayList<Integer>();
 * 			ArrayList<Double>	list = new ArrayList<Double>();
 * 
 * */
package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4_add_set_remove {
	public static void main(String[] args) {
		//ArrayList 객체 생성
		List<String> list = new ArrayList<String>();
		//list에 3개의 데이터를 추가
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		pArrayList(list);
		
		//list에 2개의 데이터를 삽입
		list.add(2, "키위");
		pArrayList(list);
		
		list.add(4,"키위");
		pArrayList(list);
		
		//인덱스 0 위치에 데이터를 "오렌지로 바꿉니다.
		list.add(0,"오렌지");
		pArrayList(list);
		
		//인덱스 1 위치에 있는 데이터를 삭제합니다
		list.remove(1);
		pArrayList(list);
		
		//list에서 "키위"라는 데이터를 찾아서 삭제합니다.
		list.remove("키위");
		pArrayList(list);
		
		}
	static void pArrayList(List<String> list) {
		System.out.println("=========================");
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			//get(index)메소드를 사용하여 index위치에 있느 자료를 가져옵니다.
			System.out.println("index="+cnt +" 데이터="+list.get(cnt));
		}
	}
}

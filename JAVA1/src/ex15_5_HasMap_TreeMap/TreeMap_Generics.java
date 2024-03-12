/*
 * TreeMap
 * 		이진 검색 트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 키로 정렬해서 저장합니다
 * 		검색과 정렬에 적합한 컬렉션 클래스입니다.
 * */

package ex15_5_HasMap_TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Generics {

	public static void main(String[] args) {
		//방법1. 업 캐스팅
		//Map<String, String> hm = new TreeMap<String, String>();
				
		//방법2.구현 클래스를 통한 객체 생성
		TreeMap<String, String> hm = new TreeMap<>();

		hm.put("woman", "재미있니");
		hm.put("man", "좋은하루");
		hm.put("age", new String("10"));
		hm.put("city", "Seoul");
		hm.put("city", "Busan"); //같은 Key 값이 들어가면 마지막에 Value 값은 오버라이트된다.
		
		//HashMap에 있는 객체들을 출력
		//출력 방법1. 해당 객체명으로 출력
		System.out.println(hm);
		//{woman=재미있니, city=Busan, man=좋은하루, age=10}
		
		//출력 방법2. Key 값만 출력
		System.out.println(hm.keySet()); //[woman, city, man, age]
		
		//출력 방법3. Value 값만 출력
		System.out.println(hm.values());
		
		//출력 방법4.
		//get(Key) : Key에 해당하는 Value를 출력 - 가장 많이 사용
		System.out.println(hm.get("woman"));//재미있니
		System.out.println(hm.get("city"));//Busan
		
		//출력 방법5.
		System.out.println("=======================");
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key + '=' + hm.get(key));
		}
	}

}

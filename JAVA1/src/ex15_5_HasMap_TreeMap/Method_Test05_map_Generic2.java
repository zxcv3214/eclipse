package ex15_5_HasMap_TreeMap;

import java.util.HashMap;
import java.util.Scanner;

public class Method_Test05_map_Generic2 {

	static HashMap<String, Integer> max_min(int data[]) {
		HashMap<String, Integer> m = new HashMap<>();
		
		int result[] = {data[0], data[0]};
		
		for(int i=1; i<data.length; i++) {
			if(result[0] < data[i])result[0] = data[i];
			if(result[1] > data[i])result[1] = data[i];
		}
		m.put("최대값",result[0]);
		m.put("최솟값",result[1]);
		
		return m;
	}
	
	public static void main(String[] args) {
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요?");
		for(int i=0; i< data.length; i++) {
			
			data[i] = sc.nextInt();
		}
			HashMap<String, Integer> m = max_min(data);
			System.out.println("최댓값 = " + m.get("최대값"));
			System.out.println("최솟값 = " + m.get("최솟값"));
					
			sc.close();
		
	}

}

package ex21_2_select_statement_method_list3;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GoodsInfo_main_Test {

	public static void main(String[] args) {
		GoodsInfo_DAO3 dao = new GoodsInfo_DAO3();
		List<Map<String, Object>> list = dao.select();

		if (list.isEmpty()) {
			System.out.println("조회된 결과가 없습니다.");			
		} else {
			System.out.println("---------- 별칭으로 접근  ------------");
			System.out.println("번호\t부서번호\t최고급여\t부서인원수");
			System.out.println("-----------------------------------");
			int no = 1;
			for (Map<String, Object> h : list) {
				System.out.println(no++ + "\t" +  h.get("deptno") 
				                        + "\t" + h.get("sal") + "\t" + h.get("cnt") + "명");
			}
		}
	}
}
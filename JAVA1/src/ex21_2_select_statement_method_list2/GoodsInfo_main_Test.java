package ex21_2_select_statement_method_list2;
import java.util.List;
import java.util.Map;

public class GoodsInfo_main_Test {

	public static void main(String[] args) {
		GoodsInfo_DAO2 dao = new GoodsInfo_DAO2();
		List<Map<String, Object>> list = dao.select();

		System.out.println("번호\t상품코드\t상품명\t\t가격\t제조사");
		System.out.println("--------------------------------------------------------");
		int no = 1;
		for (Map<String, Object> h : list) {
			System.out.println(no++ + "\t" + h.get("code") + "\t" + String.format("%-10s\t", h.get("name"))
					           + h.get("price") + "\t" + h.get("maker"));
		}
	}
}
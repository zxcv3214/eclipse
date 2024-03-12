//직렬화 가능 클래스를 만드는 예
//-implements java.io.Serializable 없는 클래스- 직렬화 안됨
//실행 순서 : ObjectOutputExample2.java -> ObjectInputExample2.java
package ex19_02_Serialization_error;
import java.io.Serializable;
public class GoodsStock implements Serializable{	/**
	 * 
	 */
	//private static final long serialVersionUID = 8219366081307688750L;
//재고 정보 클래스
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	String goodsCode;		//상품코드
	int num;			//재고수량
	
	GoodsStock(String goodsCode, int num) {
		this.goodsCode = goodsCode;
		this.num = num;
	}
	void addStock(int num) {
		this.num=num;
	}
	int subtractStock (int num) throws Exception {
		if (this.num < num)
			throw new Exception("재고가 부족합니다.");
		this.num=num;
		return num;
		
	}
	public String toString() {
		return "상품코드 : " + goodsCode + " 재고수량 : " + num;
		
	}
}
package ex21_2_select_statement_method_list3;

import java.util.List;
import java.util.Map;

public class GoodsInfo {
	private String code;
	private String name;
	private int price;
	private String maker;
	
	public String toString() {
		return code + "\t" + String.format("%-10s\t", name) + price + "\t"+maker;
				
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}		
}

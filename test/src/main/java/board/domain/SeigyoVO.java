package board.domain;

import org.apache.ibatis.type.Alias;

@Alias("SeigyoVO")
public class SeigyoVO {
	private String ryhntn_max_length;
	private String shhn_max_length;
	private String max_order_number;
	public String getRyhntn_max_length() {
		return ryhntn_max_length;
	}
	public void setRyhntn_max_length(String ryhntn_max_length) {
		this.ryhntn_max_length = ryhntn_max_length;
	}
	public String getShhn_max_length() {
		return shhn_max_length;
	}
	public void setShhn_max_length(String shhn_max_length) {
		this.shhn_max_length = shhn_max_length;
	}
	public String getMax_order_number() {
		return max_order_number;
	}
	public void setMax_order_number(String max_order_number) {
		this.max_order_number = max_order_number;
	}

}

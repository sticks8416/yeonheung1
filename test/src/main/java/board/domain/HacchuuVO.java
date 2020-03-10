package board.domain;


import org.apache.ibatis.type.Alias;

@Alias("HacchuuVO")
public class HacchuuVO {
	private String hacyu_no;
	private String ryhntn_cd;
	private String shhn_cd;
	private String hacyu_order_number;
	private String delete_flag;
	public String getHacyu_no() {
		return hacyu_no;
	}
	public void setHacyu_no(String hacyu_no) {
		this.hacyu_no = hacyu_no;
	}
	public String getRyhntn_cd() {
		return ryhntn_cd;
	}
	public void setRyhntn_cd(String ryhntn_cd) {
		this.ryhntn_cd = ryhntn_cd;
	}
	public String getShhn_cd() {
		return shhn_cd;
	}
	public void setShhn_cd(String shhn_cd) {
		this.shhn_cd = shhn_cd;
	}
	public String getHacyu_order_number() {
		return hacyu_order_number;
	}
	public void setHacyu_order_number(String hacyu_order_number) {
		this.hacyu_order_number = hacyu_order_number;
	}
	public String getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(String delete_flag) {
		this.delete_flag = delete_flag;
	}
	public HacchuuVO() {}
	
	public HacchuuVO(String hacyu_no, String ryhntn_cd, String shhn_cd, String hacyu_order_number, String delete_flag) {
		super();
		this.hacyu_no = hacyu_no;
		this.ryhntn_cd = ryhntn_cd;
		this.shhn_cd = shhn_cd;
		this.hacyu_order_number = hacyu_order_number;
		this.delete_flag = delete_flag;
	}
}

package board.domain;

import org.apache.ibatis.type.Alias;

@Alias("OrderVO")
public class OrderVO {
	private String goods_name;
	private String goods_image;
	private int goods_qty;
	private int goods_price;
}

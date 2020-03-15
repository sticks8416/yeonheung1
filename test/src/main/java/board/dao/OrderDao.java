package board.dao;

import java.util.List;
import java.util.Map;

import board.domain.HacchuuVO;

	public interface OrderDao {

		List<Map<String, Object>> orderlist() throws Exception;

	}

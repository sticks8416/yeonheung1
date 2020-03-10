package board.service;

import java.util.List;
import java.util.Map;

import board.domain.HacchuuVO;


public interface HacchuuService {
	List<Map<String, Object>> hacchuulist() throws Exception;

	/* public abstract List<HacchuuVO> hacchuulist(); */
	/* List<Map<String, Object>> kensakukekka(map) throws Exception; */

	public List<HacchuuVO> kensakukekka(Map map);
	public int sakujyo(Map map);
}

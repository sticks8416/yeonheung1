package board.dao;

import java.util.List;
import java.util.Map;

import board.domain.HacchuuVO;

public interface HacchuuDao {
	List<Map<String, Object>> hacchuulist() throws Exception;

	/* List<Map<String, Object>> seigyolist() throws Exception; */
	/* List<Map<String, Object>> kensakukekka(String shhn_cd) throws Exception; */
	public List<HacchuuVO> kensakukekka(Map map);
	public int sakujyo(Map map);
}

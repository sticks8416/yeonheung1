package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SeigyoDao {
	List<Map<String, Object>> seigyolist() throws Exception;
}

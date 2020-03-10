package board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.domain.SeigyoVO;

public interface SeigyoService {
	List<Map<String, Object>> seigyolist() throws Exception;
}

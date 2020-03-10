package board.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import board.dao.SeigyoDao;

@Service
public class SeigyoServiceImpl implements SeigyoService{
	private SeigyoDao seigyoDao;
	
	public SeigyoDao getSeigyoDao() {
		return seigyoDao;
	}
	public void setSeigyoDao(SeigyoDao seigyoDao) {
		this.seigyoDao = seigyoDao;
	}
	public List<Map<String, Object>> seigyolist() throws Exception {
		
		return seigyoDao.seigyolist();
	}
	
}

package board.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import board.dao.HacchuuDao;
import board.domain.HacchuuVO;

@Service
public class HacchuuServiceImpl implements HacchuuService{
		private HacchuuDao hacchuuDao;
		
		public HacchuuDao getHacchuuDao() {
			return hacchuuDao;
		}

		public void setHacchuuDao(HacchuuDao hacchuuDao) {
			this.hacchuuDao = hacchuuDao;
		}

		public List<Map<String, Object>> hacchuulist() throws Exception {
			
			return hacchuuDao.hacchuulist();
		}
		@Override
		public List<HacchuuVO> kensakukekka(Map map) {
			//검색결과 map 형태로 shhn_cd,ryhntn_cd map put 해서 hacchuuVO에 넣고
			return hacchuuDao.kensakukekka(map);
		}
		@Override
		public int sakujyo(Map map) {
			//검색결과 map 형태로 shhn_cd,ryhntn_cd map put 해서 hacchuuVO에 넣고
			return hacchuuDao.sakujyo(map);
		}
		
}
package board.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.dao.HacchuuDao;
import board.domain.HacchuuVO;


@Repository
public class HacchuuDaoMybatis implements HacchuuDao{
	
	private SqlSessionTemplate sqlSessionTemplate;

	public HacchuuDaoMybatis(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	@Override
	public List<Map<String, Object>> hacchuulist(){
		return sqlSessionTemplate.selectList("hacchuulist");
	}
	/*
	 * @Override public List<Map<String, Object>> seigyolist(){ return
	 * sqlSessionTemplate.selectList("seigyolist"); }
	 */
	
	/*
	 * @Override public List<Map<String, Object>> kensakukekka(String shhn_cd){
	 * return sqlSessionTemplate.selectList("kensakukekka"); }
	 */
	@Override
	public List<HacchuuVO> kensakukekka(Map map) {

		return sqlSessionTemplate.selectList("kensakukekka", map);
	}
	@Override
	public int sakujyo(Map map) {

		return sqlSessionTemplate.delete("sakujyo",map);
	}
}

package board.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.OrderVO;

@Repository
public class OrderDaoMybatis implements OrderDao{
	
	private SqlSessionTemplate sqlSessionTemplate;

	public OrderDaoMybatis(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	/*
	 * @Override public List<Map<String, Object>> Orderlist(){ return
	 * sqlSessionTemplate.selectList("Orderlist"); }
	 */
	/*
	 * @Override public List<Map<String, Object>> seigyolist(){ return
	 * sqlSessionTemplate.selectList("seigyolist"); }
	 */
	
	/*
	 * @Override public List<Map<String, Object>> kensakukekka(String shhn_cd){
	 * return sqlSessionTemplate.selectList("kensakukekka"); }
	 */
	/*
	 * @Override public List<OrderVO> kensakukekka(Map map) {
	 * 
	 * return sqlSessionTemplate.selectList("kensakukekka", map); }
	 */
}
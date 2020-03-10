package board.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SeigyoDaoMybatis implements SeigyoDao{
	private SqlSessionTemplate sqlSessionTemplate;
	
	public SeigyoDaoMybatis(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		
	}
	@Override
	public List<Map<String, Object>> seigyolist(){
		return sqlSessionTemplate.selectList("seigyolist");
	}
}

package grace.an.board.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import grace.an.board.dao.BoardDao;

@Repository("boardDaoImpl")
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao{

	@Override
	public List<Map<String, String>> countBoard() {
		return getSqlSession().selectList("boardDao.countBoard");
	}

}

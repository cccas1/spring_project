package grace.an.board.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import grace.an.board.dao.BoardDao;

@Repository("boardDaoImpl")
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao{

	@Override
	public int countBoard() {
		return (Integer) getSqlSession().selectOne("boardDao.countBoard");
	}

}

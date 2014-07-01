package grace.an.board.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import grace.an.board.dao.BoardDao;

public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao{

	@Override
	public int countBoard() {
		return (Integer) getSqlSession().selectOne("boardDao.countBoard");
	}

}

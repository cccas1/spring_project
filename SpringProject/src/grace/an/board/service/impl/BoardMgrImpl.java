package grace.an.board.service.impl;

import java.util.List;
import java.util.Map;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grace.an.board.dao.BoardDao;
import grace.an.board.service.BoardMgr;

@Service
@RemoteProxy(name="BoardMgr")
public class BoardMgrImpl implements BoardMgr{
	
	@Autowired
	private BoardDao boardDao;
	
	@RemoteMethod
	@Override
	public List<Map<String, String>> getAllBoardLists() throws Exception {
		return boardDao.countBoard();
	}

}

package grace.an.user.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import grace.an.user.dao.UserDao;

@Repository("userDaoImpl")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

}

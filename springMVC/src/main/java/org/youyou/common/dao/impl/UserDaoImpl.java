package org.youyou.common.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.youyou.common.dao.UserDao;
import org.youyou.common.domain.User;

/**
 *
 * @author youpengfeiinfo
 * @version 13-3-29
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements  UserDao{

    @Override
    public User getUser(int id) {
        return this.getSqlSession().selectOne("user.getUser",id);
    }
}

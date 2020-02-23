package com.zh.mapper;

import com.zh.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> findAll() {

        User user = new User(5, "小明", "123");

        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.add(user);
        mapper.delete(5);

        return mapper.findAll();
    }

    public int add(User user) {
        return getSqlSession().getMapper(UserMapper.class).add(user);
    }

    public int delete(int id) {
        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }
}

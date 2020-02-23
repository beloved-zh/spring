package com.zh.mapper;

import com.zh.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    //原来的操作都使用sqlSession来操作，现在使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> findAll() {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        return mapper.findAll();
    }
}

package com.company.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("testDao")  // 1. �������� �����ϴ� ��ǰ��ü - dao    - @Component
public class TestDaoImpl implements TestDao {
	
	@Autowired private SqlSession sqlSession; 
	// 2. crud(insert, update, delete, select)
	private static final String namespace="com.company.dao.TestDao";
	
	@Override
	public String readTime() {
		return sqlSession.selectOne(namespace + ".readTime");
	}
	
}

// sqlSession.insert(����� �޼����, dto)
// sqlSession.update(����� �޼����, dto)
// sqlSession.delete(����� �޼����, no)
// sqlSession.selectOne(����� �޼����, no)
// sqlSession.selectList(����� �޼����, no)
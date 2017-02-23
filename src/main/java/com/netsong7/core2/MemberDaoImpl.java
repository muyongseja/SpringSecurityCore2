package com.netsong7.core2;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private  SqlSession sqlSession;
	
	private static final String NAMESPACE="com.netsong7.mappers.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(NAMESPACE + ".getTime");
	}

	@Override
	public void insertMember(Member member) {
		sqlSession.insert(NAMESPACE + ".insertMember", member);
	}
}

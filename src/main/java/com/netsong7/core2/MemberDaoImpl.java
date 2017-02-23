package com.netsong7.core2;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private  SqlSession sqlSession;
	
	private static final String NAMESPACE="com.netsong7.mappers.MemberMapper";
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(NAMESPACE + ".getTime");
	}

	@Override
	public void insertMember(Member member) {
		member.setUserpw(bcrypt.encode(member.getUserpw()));
		sqlSession.insert(NAMESPACE + ".insertMember", member);
		
		Object[] obj = SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities().toArray();
		// 권한 확인
		/*
		for(int i=0; i<obj.length; i++){
			System.out.println(obj[i]);
		}
		*/
		
		Map map = new HashMap();
		map.put("userid", member.getUserid());
		map.put("authority", obj[0].toString());
		sqlSession.insert(NAMESPACE + ".insertAuth", map); 
	}
}











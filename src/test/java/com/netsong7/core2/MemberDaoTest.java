package com.netsong7.core2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDaoTest {
	@Autowired
	private MemberDao memberDao;
	
	@Test
	public void testTime(){
		System.out.println(memberDao.getTime());
	}
	
	@Test
	public void testInsertMember(){
		Member member = new Member();
		member.setEmail("aaa@aaa.net");
		member.setUserid("user1");
		member.setUsername("홍길동");
		member.setUserpw("1111");
		
		memberDao.insertMember(member);
	}
}












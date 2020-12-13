package com.example.spring.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.spring.model.dto.MemberDTO;

@Repository //서버가 startup될때 
public class memberDAOImpl implements memberDAO{
	
	private static final Logger logger= LoggerFactory.getLogger(memberDAOImpl.class);
	
	@Inject//의존관계
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberDTO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDTO viewMember(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		// TODO Auto-generated method stub
		return false;
	}
}

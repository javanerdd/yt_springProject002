package com.example.spring.model.dao;

import java.util.List;

import com.example.spring.model.dto.MemberDTO;

public interface memberDAO {
	
	public List<MemberDTO> memberList();//목록

	public void insertMember(MemberDTO vo);//글쓰기
	
	public MemberDTO viewMember(String userid);//상세
	
	public void deleteMember(String userid);//삭제

	public void updateMember(MemberDTO dto);//수정
	
	public boolean checkPw(String userid, String passwd); //수정,삭제시 비밀번호 체크
}

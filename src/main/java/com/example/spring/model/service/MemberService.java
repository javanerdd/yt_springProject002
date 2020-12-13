package com.example.spring.model.service;

import java.util.List;

import com.example.spring.model.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList();//목록
	
	public void insertMember(MemberDTO dto);//글쓰기
	
	public MemberDTO viewMember(String userid);//상세
	
	public void deleteMember(String userid);//삭제
	
	public void updateMember(MemberDTO dto);//수정
}

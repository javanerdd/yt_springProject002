package com.example.spring.model.service;

import java.util.List;

import com.example.spring.model.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList();//���
	
	public void insertMember(MemberDTO dto);//�۾���
	
	public MemberDTO viewMember(String userid);//��
	
	public void deleteMember(String userid);//����
	
	public void updateMember(MemberDTO dto);//����
}

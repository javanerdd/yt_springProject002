package com.example.spring.model.dao;

import java.util.List;

import com.example.spring.model.dto.MemberDTO;

public interface memberDAO {
	
	public List<MemberDTO> memberList();//���

	public void insertMember(MemberDTO vo);//�۾���
	
	public MemberDTO viewMember(String userid);//��
	
	public void deleteMember(String userid);//����

	public void updateMember(MemberDTO dto);//����
	
	public boolean checkPw(String userid, String passwd); //����,������ ��й�ȣ üũ
}

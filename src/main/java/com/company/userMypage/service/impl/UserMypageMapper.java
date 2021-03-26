package com.company.userMypage.service.impl;

import com.company.temp.MemberVO;

public class UserMypageMapper {
	//회원정보조회(단건조회)
		public MemberVO getUser(MemberVO vo);
		
		//회원정보수정
		public int updateUser(MemberVO vo);
		
		//회원탈퇴
		public int deleteUser(MemberVO vo);
}

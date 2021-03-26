package com.company.temp;

import lombok.Data;

@Data
public class MemberVO {
	public String memberId;	//아이디
	public String password;	//비밀번호
	public String email;	//이메일
	public String name;		//이름
	public String post;		//우편번호
	public String address;	//주소
	public String address2;	//상세주소
	public String phone;	//핸드폰번호
	public String auth;		//권한
	public String startDate;//가입일
	public String endDate;	//탈퇴일
}

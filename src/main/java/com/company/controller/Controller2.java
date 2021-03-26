package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.temp.MemberVO;
import com.company.userMypage.service.impl.UserMypageMapper;

@Controller
public class Controller2 {
	
	@Autowired UserMypageMapper dao;
	
	//회원조회
	@RequestMapping("/getUser")
	public String getUser(MemberVO vo) {
		
		return "views/userMypage/userMypage";
	}
}

package com.study.erum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.erum.dto.MemberDTO;

@Controller
@RequestMapping("/member")//모든 핸들러 메서드가 /member로 시작하는 URL에 매핑된다.
public class MemberController {

	
	@GetMapping("/save")
	public String saveForm() {
		return "save";
	}
	
	//주의 사항 : DTO 변수와 save.jsp에 있는 name이 반드시 일치해야 @ModelAttribue를 사용 가능!
	@PostMapping("/save")
	public String save(@ModelAttribute MemberDTO memberDTO) {
		return null;
		
	}
}

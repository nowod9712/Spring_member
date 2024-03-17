package com.study.erum.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.erum.dto.MemberDTO;
import com.study.erum.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/member") // 작업하는 모든 파일은 member로 시작하라.
@RequiredArgsConstructor
public class MemberController {

	
	private final MemberService memberService;//*생성자 주입 MemberService로 연결되어 있음.
	
	@GetMapping("/save")//보여주는 부분
	public String saveForm() {
		return "save";
	}
	
	@PostMapping("/save")//저장하는 부분
	public String save(@ModelAttribute MemberDTO memberDTO) {
		int saveResult = memberService.save(memberDTO);
			if(saveResult > 0) {
				return "login";
			}else {
				return "save";
			}
	}
	
	@GetMapping("/login")//보여주는 부분
	public String loginForm() {
		return "login";
	}
		 
	@PostMapping("/login")//저장하는 부분
	public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
		boolean loginResult = memberService.login(memberDTO);
			if(loginResult) {
				session.setAttribute("loginEmail", memberDTO.getMemberEmail());
				return "main";
			}else {
				return "login";
			}
	}
	
	  @GetMapping("/")
	  public String findAll(Model model){
	    List<MemberDTO> memberDTOList = memberService.findAll();
	    model.addAttribute("memberList", memberDTOList);
	    return "list";
	  }
	  
	// /member?id=1
	  @GetMapping
	  public String findById(@RequestParam("id") Long id, Model model){
	    MemberDTO memberDTO = memberService.findById(id);
	    model.addAttribute("member", memberDTO);
	    return "detail";
	  }
	
	
	 
}

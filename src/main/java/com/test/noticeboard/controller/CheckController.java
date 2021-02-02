package com.test.noticeboard.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.noticeboard.service.BoardService;
import com.test.noticeboard.vo.BoardVo;

@Controller
public class CheckController {
	@Autowired
	private BoardService service;
	
	@GetMapping(value = "/check")
	public String check(int num, Model model){
		model.addAttribute("num", num);
		return "check";
	}
	@PostMapping(value = "/check")
	public String checkit(int num, String writer, String pwd, Model model) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("num", num);
		map.put("writer", writer);
		map.put("pwd", pwd);
		BoardVo vo =service.check(map);
		if(vo!=null) {
			model.addAttribute("vo",vo);
			return "detail";
		}else {
			return "error";
		}
	}
	
}

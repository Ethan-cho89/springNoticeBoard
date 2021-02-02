package com.test.noticeboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.noticeboard.service.BoardService;
import com.test.noticeboard.vo.BoardVo;

@Controller
public class InsertController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping(value = "/insert")
	public String insertForm() {
		return "insert";
	}
	
	@PostMapping(value = "/insert")
	public String insert(BoardVo vo) {
		int n = service.insert(vo);
		if(n>0) {
			return "success";
		}else {
			return "error";
		}
	}
	
	
}

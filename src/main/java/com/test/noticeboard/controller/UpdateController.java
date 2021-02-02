package com.test.noticeboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.noticeboard.service.BoardService;
import com.test.noticeboard.vo.BoardVo;

@Controller
public class UpdateController {
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/update")
	public String update(BoardVo vo) {
		int n = service.update(vo);
		if(n>0) {
			return "redirect:/list";
		}else {
			return "error";
		}
	}
}

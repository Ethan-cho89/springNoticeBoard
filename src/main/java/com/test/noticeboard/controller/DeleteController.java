package com.test.noticeboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.noticeboard.service.BoardService;

@Controller
public class DeleteController {
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/delete")
	public String delete(int num) {
		int n = service.delete(num);
		if(n>0) {
			return "redirect:/list";
		}else {
			return "error";
		}
	}
}

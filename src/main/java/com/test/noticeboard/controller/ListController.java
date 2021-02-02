package com.test.noticeboard.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.noticeboard.util.PageUtil;
import com.test.noticeboard.vo.BoardVo;
import com.test.noticeboard.service.BoardService;

@Controller
public class ListController {
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/list")
	public ModelAndView list(@RequestParam(name = "pageNum", defaultValue = "1") int pageNum, HttpServletRequest req) {
		String field =req.getParameter("field");
		String keyword =req.getParameter("keyword");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("field",field);
		map.put("keyword",keyword);
		
		int totalRowCount = service.count(map); 
		
		PageUtil pu = new PageUtil(pageNum, 5, 5, totalRowCount);
		int startRow = pu.getStartRow();
		int endRow = pu.getEndRow();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		List<BoardVo> list = service.list(map);
		
		ModelAndView mv = new ModelAndView("list");
		mv.addObject("field",field);
		mv.addObject("keyword",keyword);
		mv.addObject("list",list);
		mv.addObject("pu", pu);
		return mv;
	}
}

package com.test.noticeboard.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.noticeboard.dao.BoardDao;
import com.test.noticeboard.vo.BoardVo;

@Service
public class BoardService {
	@Autowired
	private BoardDao dao;
	
	public int insert(BoardVo vo ) {
		return dao.insert(vo);
	}
	
	public List<BoardVo> list(HashMap<String , Object> map){
		return dao.list(map);
	}
	
	public int count(HashMap<String, Object> map) {
		return dao.count(map);
	}
	
	public BoardVo check(HashMap<String, Object> map) {
		return dao.check(map);
	}
	public int update(BoardVo vo) {
		return dao.update(vo);
	}
	
	public int delete(int num) {
		return dao.delete(num);
	}
}

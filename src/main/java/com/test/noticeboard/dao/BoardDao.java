package com.test.noticeboard.dao;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.noticeboard.vo.BoardVo;

@Repository
public class BoardDao {
	@Autowired
	private SqlSession sqlsession;
	
	private final String NAMESPACE = "com.test.noticeboard.mapper.BoardMapper";
	
	public int insert(BoardVo vo) {
		return sqlsession.insert(NAMESPACE+".insert",vo);
	}
	public List<BoardVo> list(HashMap<String , Object> map){
		return sqlsession.selectList(NAMESPACE+".list",map);
	}
	
	public int count(HashMap<String, Object> map) {
		return sqlsession.selectOne(NAMESPACE+".count",map);
	}
	public BoardVo check(HashMap<String, Object> map) {
		return sqlsession.selectOne(NAMESPACE+".check",map);
	}
	public int update(BoardVo vo) {
		return sqlsession.update(NAMESPACE+".update",vo);
	}
	public int delete(int num) {
		return sqlsession.delete(NAMESPACE+".delete",num);
	}
}

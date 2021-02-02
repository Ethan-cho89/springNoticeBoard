package com.test.noticeboard.vo;

import java.sql.Date;

public class BoardVo {

	private int num;
	private String writer;
	private String title;
	private String content;
	private Date regdate;
	private String pwd;
	
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardVo(int num, String writer, String title, String content, Date regdate, String pwd) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.pwd = pwd;
	}
	public int getNum() {
		return num;
	}
	public String getWriter() {
		return writer;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public String getPwd() {
		return pwd;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}

package com.test.noticeboard.util;

public class PageUtil {
	private int pageNum; // 현재 페이지의 넘버
	private int startRow; // 첫번째 게시글의 번호
	private int endRow; // 마지막 게시글의 번호
	private int totalPageCount; // 전체 페이지 넘버의 갯수
	private int startPageNum; //한페이지에서 보여질 첫페이지 넘버링 번호
	private int endPageNum; // 한페이지에서 보여질 마지막 페이지넘버링 번호
	private int rowBlockCount; // 한페이지에 띄울 글의 갯수
	private int pageBlockCount; //페이지 선택지를 몇개씩 보여줄건지
	private int totalRowCount; //전체 글의 갯수
	
	public void pageutil() {
	}

	public PageUtil(int pageNum, int rowBlockCount, int pageBlockCount, int totalRowCount) {
		super();
		this.pageNum = pageNum;
		this.rowBlockCount = rowBlockCount;
		this.pageBlockCount = pageBlockCount;
		this.totalRowCount = totalRowCount;
		
		startRow = (pageNum-1)*rowBlockCount+1;
		endRow = startRow+rowBlockCount-1; //5page라고 하면 40부터 시작 40+10-1= 49 
		totalPageCount = (int)Math.ceil(totalRowCount/(double)rowBlockCount);
		startPageNum = (pageNum-1)/pageBlockCount*pageBlockCount+1;
		endPageNum= startPageNum+pageBlockCount-1; //1+10-1 = 10
		
		if(totalPageCount <endPageNum) {
			endPageNum = totalPageCount;
		}
	}

	public int getPageNum() {
		return pageNum;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public int getStartPageNum() {
		return startPageNum;
	}

	public int getEndPageNum() {
		return endPageNum;
	}

	public int getRowBlockCount() {
		return rowBlockCount;
	}

	public int getPageBlockCount() {
		return pageBlockCount;
	}

	public int getTotalRowCount() {
		return totalRowCount;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public void setStartPageNum(int startPageNum) {
		this.startPageNum = startPageNum;
	}

	public void setEndPageNum(int endPageNum) {
		this.endPageNum = endPageNum;
	}

	public void setRowBlockCount(int rowBlockCount) {
		this.rowBlockCount = rowBlockCount;
	}

	public void setPageBlockCount(int pageBlockCount) {
		this.pageBlockCount = pageBlockCount;
	}

	public void setTotalRowCount(int totalRowCount) {
		this.totalRowCount = totalRowCount;
	}

	@Override
	public String toString() {
		return "PageUtil [pageNum=" + pageNum + ", startRow=" + startRow + ", endRow=" + endRow + ", totalPageCount="
				+ totalPageCount + ", startPageNum=" + startPageNum + ", endPageNum=" + endPageNum + ", rowBlockCount="
				+ rowBlockCount + ", pageBlockCount=" + pageBlockCount + ", totalRowCount=" + totalRowCount + "]";
	}
	
	
}

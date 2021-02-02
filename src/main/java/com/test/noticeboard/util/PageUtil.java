package com.test.noticeboard.util;

public class PageUtil {
	private int pageNum; // ���� �������� �ѹ�
	private int startRow; // ù��° �Խñ��� ��ȣ
	private int endRow; // ������ �Խñ��� ��ȣ
	private int totalPageCount; // ��ü ������ �ѹ��� ����
	private int startPageNum; //������������ ������ ù������ �ѹ��� ��ȣ
	private int endPageNum; // ������������ ������ ������ �������ѹ��� ��ȣ
	private int rowBlockCount; // ���������� ��� ���� ����
	private int pageBlockCount; //������ �������� ��� �����ٰ���
	private int totalRowCount; //��ü ���� ����
	
	public void pageutil() {
	}

	public PageUtil(int pageNum, int rowBlockCount, int pageBlockCount, int totalRowCount) {
		super();
		this.pageNum = pageNum;
		this.rowBlockCount = rowBlockCount;
		this.pageBlockCount = pageBlockCount;
		this.totalRowCount = totalRowCount;
		
		startRow = (pageNum-1)*rowBlockCount+1;
		endRow = startRow+rowBlockCount-1; //5page��� �ϸ� 40���� ���� 40+10-1= 49 
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

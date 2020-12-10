package com.rk.model;

public class DbModel {

	private int id;
    private String nm;
    private String book;
    private String date;
    private String borrowN;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBorrowN() {
		return borrowN;
	}
	public void setBorrowN(String borrowN) {
		this.borrowN = borrowN;
	}
	
	@Override
	public String toString() {
		return "DbModel [id=" + id + ", nm=" + nm + ", book=" + book + ", date=" + date + ", borrowN=" + borrowN + "]";
	}
}

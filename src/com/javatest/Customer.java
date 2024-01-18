package com.javatest;

public class Customer extends User {

	private int point;

	public Customer() {

	}

	public Customer(String id, String pw, String name, int point) {
		super(id, pw, name);
		this.point = point;

	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	
	public String toString() {
		return "아이디:" + getId() + "\t비번:" + getPw() + "\t이름:" + getName() + "\t포인트:" + point;
	}

	public void showInfo() {
		System.out.println("아이디:" + getId() + "\t비번:" + getPw() + "\t이름:" + getName() + "\t포인트:" + this.point);
	}

}

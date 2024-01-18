package com.javatest;

public class Staff extends User {

	private int salary;

	public Staff() {

	}

	public Staff(String id, String pw, String name, int salary) {
		super(id, pw, name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "아이디:" + getId() + "\t비번:" + getPw() + "\t이름:" + getName() + "\t월급:" + salary;
	}

	public void showInfo() {
		System.out.println("아이디:" + getId() + "\t비번:" + getPw() + "\t이름:" + getName() + "\t월급:" + this.salary);
	}

}

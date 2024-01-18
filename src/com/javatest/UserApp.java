package com.javatest;

import java.util.ArrayList;

public class UserApp {

	public static void main(String[] args) {

		System.out.println("-----------------회원+운영자 전체리스트----------------------");

		/*
		 * User[] userArray = new User[4];
		 * 
		 * User u01 = new Staff("master","m7788","운영자", 3500000); User u02 = new
		 * Customer("jung-ws","j1357913579","정우성", 1000); User u03 = new
		 * Customer("LeeHR","a123!!","이효리", 2500); User u04 = new
		 * Customer("ms-park","y2345","박명수", 1200);
		 * 
		 * userArray[0] = u01; userArray[1] = u02; userArray[2] = u03; userArray[3] =
		 * u04;
		 */

		ArrayList<User> ulist = new ArrayList<User>();

		User u01 = new Staff("master", "m7788", "운영자", 3500000);
		User u02 = new Customer("jung-ws", "j1357913579", "정우성", 1000);
		User u03 = new Customer("LeeHR", "a123!!", "이효리", 2500);
		User u04 = new Customer("ms-park", "y2345", "박명수", 1200);

		ulist.add(u01);
		ulist.add(u02);
		ulist.add(u03);
		ulist.add(u04);

		int count=0;
		for (int i = 0; i < ulist.size(); i++) {
			count = count+1;
			System.out.print(count + ".");
			System.out.println(ulist.get(i).toString());

		}
		
		System.out.println();

		int salary = ((Staff) ulist.get(0)).getSalary();
		System.out.println("운영자의 연봉은 " + salary * 12 + " 입니다.");
	}

}

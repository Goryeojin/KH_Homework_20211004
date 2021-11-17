package com.kh.practice4.func;

import java.util.Arrays;
import java.util.Scanner;

public class Phone {

	public String company;
	public String model;
	public String color;
	public int battery;
	public String[] address = new String[0];

	public void address_save() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\t<연락처>");
		System.out.print("저장할 연락처 갯수를 정해주세용 : ");
		int person = sc.nextInt();
		address = new String[person];

		for (int i = 1; i <= person; i++) {
			System.out.print(i + "번 연락처 : ");
			this.address[i - 1] = sc.next();
		}
		
		System.out.println(Arrays.toString(address));

	}

//	public void call() {		// 만들다가 포기.. address_save 메소드에서 변경된 필드는 메소드가 끝나면 리셋되나요?
//		
//		System.out.println(Arrays.toString(address));
//
////		int callNum = num-1;
////		return (num + "번에게 전화합니다. ☎ : " + this.address[callNum]);
//
//	}

	public String recharge() {
		
		battery = 100;
		
		return "귀하의 휴대폰을 100% 충전했습니다!";

	}

}

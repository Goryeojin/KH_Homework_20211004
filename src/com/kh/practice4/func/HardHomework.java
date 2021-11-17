package com.kh.practice4.func;

import java.util.Arrays;
import java.util.Scanner;

public class HardHomework {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String word = sc.next();
		char[] arr = new char[word.length()];
		
		System.out.print("검색 문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		String existence = "";
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = word.charAt(i);
			if(arr[i] == ch) {
				existence += i + " ";
				count++;
			}
		}
		
		System.out.println();
		System.out.println("입력하신 문자 : " + word);
		System.out.println("찾은 문자 : " + ch);
		System.out.println(word+"에 "+ch+"가 존재하는 위치(인덱스) : " + existence);
		System.out.println(ch+"의 개수 : " + count);
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이를 입력하세요! : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(i+"번째 인덱스 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		
	}
	
	public void norangChicken() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = new String[3];
		chicken[0] = "마늘치킨";
		chicken[1] = "맵싸한 고추치킨";
		chicken[2] = "순살 3종 세트";
		
		System.out.println("\t<노랑통닭>\n");
		System.out.println("---------메뉴 소개--------\n");

		for(int i=0; i<chicken.length; i++) {
			System.out.println((i+1) + " : " + (chicken[i]));
		}
		System.out.println();
		
		System.out.println("주문하실 치킨 이름을 입력하세요. : ");
		String order = sc.next();
		
		boolean existence = false;
		
		for(int i=0; i<chicken.length; i++) {
			
			if(chicken[i].equals(order)) {
				System.out.println(chicken[i]+" 배달 가능");
				existence = true;
			}
		}
		if(!existence) {
			System.out.println(order+"은 없는 메뉴입니다.");
		}
		
	}
	
	public void twinkle_star() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int star = sc.nextInt();
		
		for(int i=0; i<star; i++) {
			System.out.println();
			for(int j=star; j>i; j--) {
				System.out.print("*");
			}
			
		}
		
	}

}

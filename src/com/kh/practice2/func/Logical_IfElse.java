package com.kh.practice2.func;

import java.util.Scanner;

public class Logical_IfElse {

	public void compareInt() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t<입력한 정수의 크기 비교> (단, num1 < num2 이어야함.\n");
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("크기를 비교할 정수를 입력하세요 : ");
		int comparison = sc.nextInt();
		System.out.println();
		
		boolean check = (num1 >= comparison) || (comparison > num2);
		System.out.println(check);
		
	}
	
	public void matchUp() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t<세 개의 수 일치 여부 출력>\n");
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수 입력 : ");
		int num3 = sc.nextInt();
		System.out.println();
		
		boolean match = (num1 == num2) && (num2 == num3);
		System.out.println(match);
		
	}
	
	public void oddsAndEvens() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t<홀짝 판별기>\n");
		
		System.out.print("숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println();
		
		if(num <= 0) {
			System.out.println("양수만 입력하시죠?");
		} else if(num % 2 == 0) {
			System.out.println("짝수입니다!");
		} else {
			System.out.println("홀수입니다!");
		}
		
	}
	
	public void calculator() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t<직접 만드는 계산기>\n");
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 (+ - * / %) : ");
		char op = sc.next().charAt(0);
		
		double result;
		
		System.out.println();
		
		if((num1 <= 0 || num2 <= 0) || (op != '+' && op != '-' && op != '*' && op != '/' && op!= '%')) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} else {
			if(op == '+') {
				result = (double)num1 + num2;
			} else if(op == '-') {
				result = (double)num1 - num2;
			} else if(op == '*') {
				result = (double)num1 * num2;
			} else if(op == '/') {
				result = (double)num1 / num2;
			} else {
				result = num1 % num2;
			}
			System.out.printf("%d %c %d = %.1f", num1, op , num2 , result);
		}
		
	}


}

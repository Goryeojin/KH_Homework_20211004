package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void example01() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t<정수 계산기>");
		
		System.out.print("첫 번째 정수를 입력하세요. > ");
		int inum1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요. > ");
		int inum2 = sc.nextInt();
		
		int add = inum1 + inum2;
		int min = inum1 - inum2;
		int multipl = inum1 * inum2;
		int division = inum1 / inum2;
		
		System.out.println();
		System.out.println("더하기 결과 : " + add);
		System.out.println("빼기 결과 : " + min);
		System.out.println("곱하기 결과 : " + multipl);
		System.out.println("나누기 몫 결과 : " + division);
		
	}
	
	public void example02() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t<사각형의 면적과 둘레 계산>");
		
		System.out.print("가로 > ");
		double width = sc.nextDouble();
		System.out.print("세로 > ");
		double length = sc.nextDouble();
		
		double area = width * length;
		double perimeter = (width + length) * 2;
		
		System.out.println();
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + perimeter);
		
	}
	
	public void example03 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t<문자 3개 출력>");
		
		System.out.print("영단어 입력 > ");
		String text = sc.nextLine();
		
		System.out.println();
		System.out.println("첫 번째 문자 : " + text.charAt(0));
		System.out.println("두 번째 문자 : " + text.charAt(1));
		System.out.println("세 번째 문자 : " + text.charAt(2));
		
	}
	
	public void example04() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t<KH고등학생의 성적 기록^^>");
		
		System.out.print("이름 입력 > ");
		String name = sc.nextLine();
		System.out.print("학년 입력 > ");
		int grade = sc.nextInt();
		System.out.print("반 입력 > ");
		int cla$$ = sc.nextInt();
		System.out.print("번호 입력 > ");
		int num = sc.nextInt();
		System.out.print("성적 입력(소수점 아래 둘째자리까지) > ");
		double result = sc.nextDouble();
		
		System.out.println();
		System.out.println(grade+"학년 "+cla$$+"반 "+name+"학생의 성적은 "+result+"이다.");
		
		System.out.println("강사님 수고하십니당~!");
		
	}

}

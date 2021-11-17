package com.kh.practice3.func;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1 {

	public void arrayMethod1() {

		int[] arr = new int[10]; // int타입 arr 배열 선언 후 인덱스 10개의 값 할당

		for (int i = 0; i < arr.length; i++) { // for문으로 각 인덱스에 랜덤 수 초기화
			arr[i] = (int) (Math.random() * 10) + 1;
		}

		int min = arr[0]; // 인덱스 각각의 값이 정해진 뒤 최솟값을 구하기 위해 min에 arr[0]값 대입
		int max = arr[0]; // for문 내부 if문에서 사용하고 for문 바깥에서 출력하기 위해 max값 선언 및 초기화
		for (int i = 0; i < arr.length; i++) { // 인덱스 0~9(배열arr의길이)까지 반복
			if (min > arr[i]) { // 최솟값 구하기
				min = arr[i];
			}
			if (max < arr[i]) { // 최댓값 구하기
				max = arr[i];
			}
			System.out.print(arr[i] + " "); // for문 내부에서 반복으로 arr배열의 각 인덱스 값 출력하기
		}
		System.out.println(); // print문은 개행이 안되서 미리 해주는 센스~
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

	}

	public void makingLotto1() {

		System.out.println("\t<로또 번호 추첨기>\n");

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {

				if (arr[j] == arr[i]) {
					i--;
					System.out.printf("[중복된 수 : %d]\n", arr[i]);
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void tooHardHomework() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String word = sc.next();

		char[] arr = new char[0];

		for (int i = 0; i < word.length(); i++) {
			boolean test = false;

			for (int j = 0; j < arr.length; j++) {
				if (word.charAt(i) == arr[j]) {
					test = true;
				}

			}

			if (!test) {
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[arr.length - 1] = word.charAt(i);
			}
		}

		System.out.println("문자열 : " + word);
		System.out.println(Arrays.toString(arr));
		System.out.println("중복되지 않는 문자 갯수 : " + arr.length);

	}

	// 21일 숙제 같이 풀어보기
	public void method9() {
		
		// 3번 문제
		
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		// 문자의 개수와 함께 출력하세요.
		// ex) 
		// 문자열 : application
		// 문자열에 있는 문자 : a, p, l, i, c, t, o, n
		// 중복되지 않는 문자 개수 : 8
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 > ");	// alias
		String str = sc.next();
		
		String result = "문자열에 있는 문자 : " + str.charAt(0) + " ";	// 문자열에 있는 문자 : a" "
		int count = str.length();	// 5
		
		// i부터 문자열의 길이까지
		for(int i=1; i<str.length(); i++) {
			// 반복문으로 charAr(i)번째 인덱스의 charAt(j)번째 인덱스까지 비교
			for(int j=0; j<i; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count--;
					break;
				} // 중복되지 않는 값을 넣어야 하는데, 굳이 조건식을 주자면!
				 else if(str.charAt(i)!=str.charAt(j) && j == (i-1)){
					result += str.charAt(i)+ " ";
				}
				
			}
		}
		
		System.out.println("문자열 : " + str);
		System.out.println(result);
		System.out.println("중복되지 않는 문자 갯수 : " + count);
	}
}

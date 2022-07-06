package com.test;

import java.util.Scanner;

public class CH2_Variable {
	//ScannerEX
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		ScannerEx();

	}


	public static void ScannerEx(){
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);

		System.out.println("입력내용: "+input);
		System.out.printf("num=%d",num); //printf 형식화된 출력 
	}
}
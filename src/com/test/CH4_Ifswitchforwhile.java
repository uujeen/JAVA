package com.test;

import java.util.Scanner;

public class CH4_Ifswitchforwhile {
	public static void main(String[] args) {
		//ExampleIf();
		//ExampleIf2();
		//ExampleIf3();
		//ExampleSwitch();
		//ExampleSwitch2();
		//ExampleFor();
		//ExampleFor2();
		//ExampleFor3();
		ExampleFor4();
	}

	public static void ExampleIf(){
		int num ;
		Scanner scr = new Scanner(System.in);
		System.out.printf("정수를입력하세요 : ");
		num = scr.nextInt();
//		if(num > 1) { //조건식은 언제나 true/false로 구성되어야 한다.
//			System.out.println("num이 1보다 크다.");
//		}
//		else {
//			System.out.println("num이 1보다 작거나 같다.");
//		}
		if (num>1) 
			System.out.println("num이 1보다 크다.");
		else 
			System.out.println("num이 1보다 작거나 같다.");
	}
	
	public static void ExampleIf2() {
		String str = "";
		Scanner scr = new Scanner(System.in);
		System.out.printf("문자열을 입력하세요 : ");
		// str = scr.nextLine(); next()와 같은 함수 
		str = scr.next();
		
		if(str.equals(null)) 
			System.out.println("null값입니다.");
		else 
			System.out.println("null이 아닙니다.");
	}
	
	public static void ExampleIf3() {
		String tmp = "";
		int num = 0;
		Scanner scr = new Scanner(System.in);
		
		System.out.printf("점수를 입력하세요 : ");
		tmp=scr.next();
		num = Integer.parseInt(tmp); // String을 Int로 형변환.
		String grade = "";
		if(num>=90)
			grade = "A";
		else if(num>=80) // (num>= 80 %% num<90)라고 안 쓴 이유는 if(num>=90)에서 이미 거짓으로 넘어왔기 때문이다. 
			grade = "B";
		else if(num>=70)
			grade = "C";
		else
			grade = "D";
		System.out.printf("당신의 학점은 score = %d, grade = %s", num, grade);
	}
	
	public static void ExampleSwitch() { // switch문의 조건은 정수 또는 문자열이여야한다.
		String tmp = new String(""); // case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.
		Scanner src = new Scanner(System.in);
		System.out.print("몇 월 인지 쓰세요 : ");
		tmp = src.nextLine();
		int month = Integer.parseInt(tmp);
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("Spring");
			break;
		case 6: case 7: case 8:
			System.out.println("Summer");
			break;
		case 9: case 10: case 11:
			System.out.println("Autumn");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		default : // case문에 해당하지 않는 기타 값들을 처리하는 것 
			System.out.println("Else");
		}
	}
	
	public static void ExampleSwitch2() {
		String str = new String("");
		Scanner src = new Scanner(System.in);
		System.out.print("당신의 주민번호를 입력하세요 : ");
		
		str = src.nextLine();
		char gender = str.charAt(7); //입력받은 문자열의 8번째 인덱스를 char형태로 저장한다.
		
		switch(gender) {
		case '1': case '3':
			System.out.println("성별은 남자입니다.");
			break;
		case '2': case '4':
			System.out.println("성별은 여자입니다.");
			break;
		default:
			System.out.println("Error");
		}
	}
	
	public static void ExampleFor() {
//		for(int i=0;i<10;i++) for(초기화;조건식;증감식)
//		for(int i=0,j=0;<i<10;i++)
//		for(int i=0;i<10;i +=2) 2씩 증가
//		for(int i=0;i<10;i *=3) 3배 증가
//		for(int i=0,j=10;i<10;i++,j--) i는 1씩 증가, j는 1씩 감
		System.out.println("i \t i%3 \t i/3");
		System.out.println("---------------");
		for(int i=1;i<=10;i++) { // i%3 순환, i/3 반복 
			// %5d, %-5d -> 5자리수 만큼 만들고 오른쪽 정렬, 왼쪽 정렬  
			System.out.printf("%d \t %d \t %5d \t %d%n",i,i%3,i%3,i/3);
		}
	}
	public static void ExampleFor2() {
		int num = 0;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("3이하의 정수를 입력하세요 : ");
		num = scr.nextInt();
		
		for(int i=0;i<=num;i++)
			for(int j=0;j<=num;j++)
				for(int k=0;k<=num;k++)
					System.out.println(""+i+j+k);
	}
	
	public static void ExampleFor3() {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		// 위 아래 두개의 for문은 서로 같다.
		// for(타입 변수명 : 배열 또는 컬렉션), 타입 변수는 배열 또는 컬렉션의 요소의 타입.
		//매 반복마다 하나씩 순서대로 읽혀서 변수에 저장된다.
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum +=tmp;
		}
		System.out.println();
		System.out.println("sum = "+sum);
	}
	
	public static void ExampleFor4() {
		// Loop1 이라는 이름을 붙이고 break 이름; 을 통해 해당하는 반복문 break가능 
		Loop1 : for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5) break Loop1; // j가 5일때 Loop1을 탈출 
				//break;
				//continue Loop1; j가 5일때 Loop1의 끝으로 돌아가기 
				//continue;
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
}

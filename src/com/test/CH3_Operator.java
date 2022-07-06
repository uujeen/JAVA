package com.test;

public class CH3_Operator {
	public static void main(String[] args) {
		Operator1();
		Operator2();
		Operator3();
		Operator4();
	}
	
	public static void Operator1(){
		int x = 5;
		x = x ++ - ++ x; // x의 변화 5 -> 6 -> 7 -> -2
		
		System.out.println(x);
	}
	
	public static void Operator2() {
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d=%d%n", a, a, a, result1); // -727, overflow 발생한 후 a로 나
		System.out.printf("%d * %d / %d=%d%n", a, a, a, result2); // 1000000, 1*1000000
	}
	
	public static void Operator3() {
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';
		
		int i = c1 + 1; // 97 + 1
		
		c3 = (char)(c1 +1); // 'b' = 98
		c2++;
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
	}
	
	public static void Operator4() {
		char c1 = 'a';
		
		// char c2 = c1 + 1; 컴파일 에러발생, 컴파일러가 미리 계산을 할 수 없기 때문에 형변환 x
		// -> char c2 = (char)(c2+1); 으로 해야 가능
		char c2 = 'a' + 1; //리터럴 간의 연산이기 떄문에 에러발생x
		System.out.println(c2);
	}
}

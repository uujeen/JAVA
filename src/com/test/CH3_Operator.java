package com.test;

public class CH3_Operator {
	public static void main(String[] args) {
		Operator1(); // 증감연산자의 계산 순
		Operator2(); // 자료형의 overflow 시 값의 변화
		Operator3(); // char 형의 int 값을 더했을 때 반환
		Operator4(); // 자료형 변환 시 주의할 점
		Operator5(); // math.round()의 반올림
		Operator6(); // 나머지 연산자시 피연산자의 부호 생략
		Operator7(); // A.equals("B") 문자열 A, B 비교 bool 값 반
		Operator8(); // 쉬프트연산자의 계
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
	
	public static void Operator5() {
		double pi = 3.141592;
		double ShortPi = Math.round(pi*1000)/ 1000.0; // 1000 나눌 경우 3.0 출력
		System.out.println(ShortPi);
	}
	
	public static void Operator6() {
		System.out.println(10%8);
		System.out.println(10%-8);
	}
	
	public static void Operator7() {
		// String str = new String("abc");
		String str = "abc";
		
		boolean result = str.equals("str"); // str과 equals()내에 있는 문자열과 비교 bool값 반환
		System.out.println(result);
		
	}
	
	public static void Operator8() {
		String x = "x";
		String n = "n";
		System.out.printf("%s<<%s = %s*2^%s%n", x, n, x, n);
		System.out.printf("%s>>%s = %s/2^%s", x, n, x, n);
	}
}

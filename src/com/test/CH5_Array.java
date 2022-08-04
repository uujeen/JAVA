package com.test;

import java.util.*;

public class CH5_Array {
	public static void main(String[] args) {
		// ExampleArr();
		// ExampleCopy();
		// ExampleSort();
		// ExampleMatrix();
		test1("B2D3A4C1");
		test2("C2D3A4B5");
		
	}
	// 문자열 재정렬
	// 대문자와 숫자의 혼합을 입력 받고, 정렬 및 숫자는 합을 더해서 출
	public static void test1(String str) {
		String[] arr = str.split("");
		char[] tmp = new char[arr.length];
		
		int num = 0 , stack = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(Character.isLetter(str.charAt(i))) {
				tmp[stack]	= str.charAt(i);
				stack++;
			}
			else num += str.charAt(i)-'0';
		}
		
		Arrays.sort(tmp);
		System.out.println(new String(tmp)+num);
		
	}
	// ArrayList 사용 
	public static void test2(String str) {
		ArrayList<Character> result = new ArrayList<Character>();
		int size = str.length();
		int num = 0;
		for(int i=0;i<size;i++) {
			if(Character.isLetter(str.charAt(i))) {
				result.add(str.charAt(i));
			}
			else num += str.charAt(i)-'0';
		}
		Collections.sort(result);
		for(int i=0; i<result.size();i++) {
			System.out.print(result.get(i));
		}
		if(num!=0) {
			System.out.print(num);
		}
		
	}
	public static void ExampleArr() {
		// 타입[] 변수이름; 변수 선언 
		// 변수이름 = new 타입[길이]; 변수 생성 
		// 타입[] 변수이름 = new 타입[길이]; 선언 및 생성 
		int[] arr = new int[5]; 
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = {10, 20, 30, 40, 50};
		// System.out.println(arr.length); 배열의 길이 
		int[] sum_arr = add(arr1, arr2);
		System.out.println(Arrays.toString(sum_arr)); // 전체 배열 출력 
		char[] chrr = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(chrr); // char 배열은 구분자 없이 abcde로 출력된다.
	}
	
	public static int[] add(int[] arr, int[] arr2) {
		int[] add = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			add[i] = arr[i] + arr2[i];
		}
		
		return add;
	}
	
	public static void ExampleCopy() {
		int[] arr = new int[5];
		int[] newArr = new int[5];
		// .arraycopy(배열1,index,배열2,index,길이); 배열1의 index부터 배열2의 index에 길이만큼 복사
		arr = new int[] {10, 20, 30, 40, 50};
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		
		System.out.println("복사된 배열입니다. "+Arrays.toString(newArr));
	}
	
	public static void ExampleSort() {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]= (int)(Math.random()*10);
		}
		boolean changed = false;
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
					changed = true;
				}
			}
			if(!changed) break;
		}
		
		System.out.println("정렬 후 : "+Arrays.toString(arr));
	}
	
	public static void ExampleMatrix() {
		int[][] m1 = {
				{6, 2, 3},
				{2, 5, 4}
		};
		
		int[][] m2 = {
				{1, 0},
				{2, 1},
				{-1, 1}
		};
		
		final int ROW = m1.length;
		final int COL = m2[0].length;
		final int m2_ROW = m2.length;
		
		int[][] m3 = new int[ROW][COL];
		
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				for(int k=0;k<m2_ROW;k++) {
					m3[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		for(int i=0;i<m3.length;i++) System.out.println(Arrays.toString(m3[i]));
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				System.out.printf("%2d ",m3[i][j]);
			}
			System.out.println();
		}
	}
}

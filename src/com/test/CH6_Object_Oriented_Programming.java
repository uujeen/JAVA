package com.test;

public class CH6_Object_Oriented_Programming {
	
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;
		t2.channel = 11;
		
		System.out.printf("t1의 채널 %d, t2의 채널 %d%n",t1.channel, t2.channel);
		
		t1.channelup();
		t2.channeldown();
		
		System.out.printf("t1의 채널 %d, t2의 채널 %d",t1.channel, t2.channel);
		System.out.println();
		Time[] time = new Time[3];
		for(int i=0;i<time.length;i++) {
			time[i] = new Time();
		}
		
		System.out.printf("width : %d, height : %d",Card.width, Card.height);
		System.out.println();
	    // 클래스변수는 클래스.클래스변수 사용 가능
	    Card c1 = new Card();
	    c1.kind = "Heart";
	    c1.number = 9;
	    
	    Card c2 = new Card();
	    c2.kind = "Spade";
	    c2.number = 2;
	    
	    c1.kind = "Spade"; // 인스턴스 변수의 값 변경
	    c1.number = 4;
	    
	    c1.width = 120; // 클래스 변수의 값 변경
	    c1.height = 240; // = c2.width = 120, c2.height = 240
	    System.out.printf("width : %d, height : %d",c2.width, c2.height);
	}

}

class Tv { // 클래스 영역 
	
	String color; // 인스턴스 변수 
	int channel;
	static boolean power; // 클래스 변수(static 변수, 공유 변수)
	
	void power() { power = !power; } // 메소드 영역 
	void channelup() {++channel;}
	void channeldown() {--channel;}
}

class Time { // 클래스 영역 
	int hour; // 인스턴스 변수 
	int minute;
	static float second; // 클래스 변수(static 변수, 공유 변수)
	
	public int getHour() {return hour;} 
	public int getMinute() {return minute;}
	public float getSecond() {return second;}
	
	public void setHour(int h){ // 메소드 영역 
		if (h<0 || h>24 ) return;
		hour = h;
	}
	
	public void setMinute(int m) {
		if(m<0 || m>59) return;
		minute = m;
	}
	
	public void setSecond(float s) {
		if(s<0.0f || s>59.99f) return ;
		second = s;
	}
}

class Card { // 클래스 영역
	String kind; // 인스턴스 변수
    int number;
    
    static int width = 100; // 클래스 변수
    static int height = 200;
}
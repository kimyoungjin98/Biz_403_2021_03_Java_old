package com.youngjin.practice;

public class Practice_07 {

	public static void main(String[] args) {
	
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		intKor = 80;
		intEng = 77;
		intMath = 65;
		
		int intSum = 0;
		int intAvg = 0;
		
		intSum += intKor;
		intSum += intEng;
		intSum += intMath;
		
		intAvg = intSum / 3;
		
		System.out.println("======================");
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("-----------------------");
		System.out.printf("총점 : %d\t", intSum);
		System.out.printf("평균 : %d\n", intAvg);
		System.out.println("======================");
	}
	
}

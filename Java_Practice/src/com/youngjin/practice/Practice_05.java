package com.youngjin.practice;

public class Practice_05 {

	public static void main(String[] args) {
	
		int intDan = 0;
		int intNum = 0;
		
		intDan = 3;
		intNum = 1;
		
		// sysout 명령 안에서 ++intNum이 먼저 실행되고 그 뒤의 intNum은 자동적으로 1을 저장한값으로 연산이 된다
		System.out.printf("%d x %d = %d\n" , intDan, ++intNum, intDan * intNum );
		System.out.printf("%d x %d = %d\n" , intDan, ++intNum, intDan * intNum );
		System.out.printf("%d x %d = %d\n" , intDan, ++intNum, intDan * intNum );
		System.out.printf("%d x %d = %d\n" , intDan, ++intNum, intDan * intNum );
		System.out.printf("%d x %d = %d\n" , intDan, ++intNum, intDan * intNum );
		System.out.printf("%d x %d = %d\n" , intDan, ++intNum, intDan * intNum );
		System.out.printf("%d x %d = %d\n" , intDan, ++intNum, intDan * intNum );
		System.out.printf("%d x %d = %d\n" , intDan, ++intNum, intDan * intNum );
		
	}
	
}

package chap01.quiz;

import java.util.Scanner;

public class Quiz15 {
	// TODO 왼쪽 아래가 직각인 이등변 삼각형 출력하는 메소드
	static void triangleLB (int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	// TODO 왼쪽 위가 직각인 이등변 삼각형 출력하는 메소드
	static void triangleLU (int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	// TODO 오른쪽 위가 직각인 이등변 삼각형을 출력하는 메소드
	static void triangleRU (int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	// TODO 오른쪽 아래가 직각인 이등변 삼각형을 출력하는 메소드
	static void triangleRB (int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단 수 : ");
		int n = scan.nextInt();
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
		triangleLB(n);
		
		System.out.println();
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형");
		triangleLU(n);
		
		System.out.println();
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형");
		triangleRU(n);
		
		System.out.println();
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
		triangleRB(n);
		
		scan.close();
		
	}

}

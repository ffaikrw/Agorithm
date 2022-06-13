package chap01.quiz;

import java.util.Scanner;

public class Quiz09 {
	// TODO 정수 a와 b를 포함한 그 사이의 모든 정수의 합을 구하여 반환하는 메소드 작성
	
	static int sumOf(int a, int b) {
		
		int sum = 0;
		
		if (a < b) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		} else if (a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		} else {
			sum = a;
		}
		
		return sum;
	}

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = scan.nextInt();
		
		System.out.print("b : ");
		int b = scan.nextInt();
		
		System.out.println("a와 b를 포함한 둘 사이 모든 정수의 합은 " + sumOf(a, b) + "입니다.");
		
		scan.close();
		
	}

}

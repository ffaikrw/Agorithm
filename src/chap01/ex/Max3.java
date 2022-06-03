package chap01.ex;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		// TODO 3개의 정수값을 입력하고 최댓값을 구한다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값 구하기");
		
		System.out.print("a: ");
		int a = scan.nextInt();
		
		System.out.print("b: ");
		int b = scan.nextInt();
		
		System.out.print("c: ");
		int c = scan.nextInt();
		
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		System.out.println("최댓값은 " + max + "입니다.");
		
		scan.close();
	}

}

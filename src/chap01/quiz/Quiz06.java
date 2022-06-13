package chap01.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO 1 ~ n까지의 합을 구하는 while문이 종료될 떼 변수 i의 값이 n+1이 됨을 확인하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i의 값은 "+ i + "입니다.");
		
		scan.close();
	}

}

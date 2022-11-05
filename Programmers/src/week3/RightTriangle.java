package week3;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		/*
		 * "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형 출력
		 * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력
		 * 
		 * <별찍기>
		 * 입력값: 3
		 * 출력
		 *     *
		 *     **
		 *     ***
		 */
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
        	for(int j = 1; j <= i ; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
		
	}

}

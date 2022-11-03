package week2;

import java.util.Scanner;

public class StarUp {

	public static void firstBlank(int n) {
		String blank = " ";
		for(int i = 1; i < n; i++) {
			System.out.print(blank);
		}
	}
	
	public static void main(String[] args) {
		String star = "*";
		String blank = " ";
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		firstBlank(n);
		System.out.print(star);
		firstBlank(n);
		
		System.out.println();
		
		int center = 1;
		for(int i = 2; i <= n ; i++) {
			
			for(int j = 0; j < n-i; j++) {
				System.out.print(blank);
			}
			System.out.print(star);
 			
			for(int j = 0; j < center; j++ ) {
				System.out.print(blank);
			}
			System.out.print(star);
			
			for(int j = 0; j < n-i; j++) {
				System.out.print(blank);
			}
			System.out.println();
			center += 2;
		}
		
		
		
		
		
		
		
	}

}

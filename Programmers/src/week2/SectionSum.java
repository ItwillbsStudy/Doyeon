package week2;

import java.util.Scanner;

public class SectionSum {

	public static void main(String[] args) {
		//a, b 입력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//b길이의 배열
		int [] array = new int [b];
		
		//미완성
		// 1, 2, 2, 3, 3, 3, 4...수 배열에 넣기
		int num = 0;
		for(int i = 0; i < array.length; i++) {
			num++;
			for(int j = 0; j < num; j++) {
				array[i] = num;
			}
		}
		
		// 입력된 a ~ b 위치 까지의 합 계tks
		int sum = 0;
		for(int i = a - 1; i < b - 1; i++) {
			sum += array[i];
		}
		
		System.out.println(sum);
	}

}

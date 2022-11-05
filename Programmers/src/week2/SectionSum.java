package week2;

import java.util.Scanner;

public class SectionSum {

	public static void main(String[] args) {
		//a, b 입력
		Scanner sc = new Scanner(System.in);
		int a = 1;//sc.nextInt();
		int b = 5;//sc.nextInt();
		
		//b길이의 배열
		int [] array = new int [b+1];
		
		// 1, 2, 2, 3, 3, 3, 4...수 배열에 넣기
		int num = 0;
		int index = 0;
		ADD:
		while(index < array.length) {
			
			if(index > b)break ADD;
			num += 1;
			for(int i = 0; i < num; i++) {
				array[index] = num;
				System.out.println(array[index]);
			}
			index++;
		}
		
//		0, 1, 2, 3,
		
		// 입력된 a ~ b 위치 까지의 합계
		int sum = 0;
		for(int i = a-1; i < b-1; i++) {
			sum += array[i];
		}
		
		System.out.println(sum);
	}

}

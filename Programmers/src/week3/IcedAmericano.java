package week3;

import java.util.Scanner;

public class IcedAmericano {

	public static void main(String[] args) {
		/*
		 * 아이스 아메리카노는 한잔에 5,500원입니다.
		 * 가지고 있는 돈 money가 매개변수
		 * 최대로 마실 수 있는 아메리카노의 잔 수와 
		 * 남는 돈을 순서대로 담은 배열을 return
		 */
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // 매개변수
		
		/*
		 * 최대 잔 수 : (int)(money / 5500) 
		 *                  => double 타입으로 답이 나오니까 int형으로 변환
		 * 잔돈: money - (최대잔수 * 5500)
		 */
		
		int max = (int) money / 5500;
		int change = money - (max * 5500);
		// (==) int change = money % 5500;
		
		int[] array = {max, change};
	}

}

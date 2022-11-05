package week3;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		/*
		 * 10만원 이상 사면 5%, 
		 * 30만원 이상 사면 10%, 
		 * 50만원 이상 사면 20%를 할인해줍니다.
		 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return
		 */
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		int ten = 100000;
		int pay = 0;
		
		/* price > ten 		=> pay = price*0.95
		 * price > ten * 3 	=> pay = price*0.9
		 * price > ten * 5 	=> pay = price* 0.8
		 */
		
		if(price >= ten) {

			pay = (price >= ten * 5) ? (int)(price * 0.8) :
				  (price >= ten * 3) ? (int)(price * 0.9) : (int)(price * 0.95);

		}else {
			pay = price;
		}
		
		System.out.println(pay);
		
	}

}
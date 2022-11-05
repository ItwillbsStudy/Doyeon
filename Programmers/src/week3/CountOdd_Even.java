package week3;

public class CountOdd_Even {

	public static void main(String[] args) {
		/*
		 * 정수가 담긴 리스트 num_list가 주어질 때, 
		 * 원소 중 짝수와 홀수의 개수를 담은 배열을 return
		 */
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < num_list.length; i++) {
			
			if(num_list[i] % 2 == 0)	even++;
			else						odd++;
		}
		
		int[] answer = {even, odd};
		
		System.out.println("짝수의 개수: " + answer[0] + ", 홀수의 개수 : " + answer[1]);
		
	}

}

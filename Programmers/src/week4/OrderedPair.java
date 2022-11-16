package week4;

public class OrderedPair {
	public static void main(String[] args) {
		/*
		 * 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 
		 * 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return
		 */

		// 파라미터
		int n = 100;
		
		int answer = 0;

		//자연수 순서쌍은 (1,100)...(100,1)까지이다.
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) answer += 1;
		}

		System.out.println(answer);

	}
}

package week2;

public class PizzaShare2 {

	public int solution(int n) {
		int answer = 0, i = 1;
		// 6조각의 피자를 n명의 사람으로 나누었을 때, 남는 피자가 없을 때까지
		// while문 반복한다.
		while(true) {
			answer = 6 * i;
			if (answer % n == 0) break;
			i += 1;
		}
		
		return answer / 6;
	}
}

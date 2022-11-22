package week5;

public class Ant {

	public int solution(int hp) {
		//장군개미 5 병정개미 3 일개미 1
		int answer = 0;
		answer += hp / 5;
		answer += (hp % 5) / 3;
		answer += (hp % 5 % 3) / 1;
		return answer;
	}

}

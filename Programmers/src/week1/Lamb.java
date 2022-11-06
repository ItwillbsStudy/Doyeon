package week1;

public class Lamb {
	//n: 양꼬치 k: 음료수
	//양꼬치 10인분마다 음료수 1개 서비스
	public int solution(int n, int k) {
		int answer = 0;
		answer = (n * 12000) + (k * 2000);
		if(n >= 10) answer -= (2000 * (n / 10));
		return answer;
	}
}

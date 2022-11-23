package week5;

public class Marble {

	public static void main(String[] args) {
		/*
		 * 갖고 있는 구슬의 개수 balls와 나누어 줄 구슬 개수 share이 매개변수
		 * 구슬을 고르는 가능한 모든 경우의 수를 return
		 * 			 balls!
		 *  ------------------------
		 *  (balls-share)! X  share!
		 */
		// 파라미터
		int balls = 5;
		int share = 3;
		//return 값
		long ballsp = 1L;
		long sharep = 1L;
		long bmsp = 1L;
		
		int answer = 0;
		
		if((balls/2) > share) {
			//조건: balls > (balls-share)
			//그거를 share로 나눔
			for(int i = balls; i > (balls-share); i--){
				ballsp *= i;
			}
			for(int i = share; i > 0; i--) {
				sharep *= i;
			}
			answer = (int)(ballsp / sharep);
		}else {
			//조건: balls > share
			//그거를 balls-share로 나눔
			for(int i = balls; i > share; i--){
				ballsp *= i;
			}
			for(int i = (balls-share); i > 0; i--) {
				bmsp *= i;
			}
			answer = (int)(ballsp / bmsp);
		}
		
		System.out.println(answer);
	}

}

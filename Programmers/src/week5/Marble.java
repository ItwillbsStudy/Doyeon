package week5;

import java.math.BigInteger;

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
		BigInteger ballsp = new BigInteger("1");
		BigInteger sharep = new BigInteger("1");
		BigInteger bmsp = new BigInteger("1");
		
		BigInteger answer = new BigInteger("0");
		
		if((balls/2) > share) {
			//조건: balls > (balls-share)
			//그거를 share로 나눔
			for(int i = balls; i > (balls-share); i--){
				BigInteger index = new BigInteger(String.valueOf(i));
				ballsp = ballsp.multiply(index);
			}
			for(int i = share; i > 0; i--) {
				BigInteger index = new BigInteger(String.valueOf(i));
				sharep = sharep.multiply(index);
			}
			answer = ballsp.divide(sharep);
		}else {
			//조건: balls > share
			//그거를 balls-share로 나눔
			for(int i = balls; i > share; i--){
				BigInteger index = new BigInteger(String.valueOf(i));
				ballsp = ballsp.multiply(index);
			}
			for(int i = (balls-share); i > 0; i--) {
				BigInteger index = new BigInteger(String.valueOf(i));
				bmsp = bmsp.multiply(index);
			}
			answer = ballsp.divide(bmsp);
		}
		
		System.out.println(answer.intValue());
	}

}

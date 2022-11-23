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
		
		//팩토리얼 값을 넣어줄 변수
		//int long 모두 에러가 나서 BigInteger 클래스로 선언
		//BigInteger 클래스는 숫자의 의미를 가지는 문자열로 선언하므로 무한의 가능성
		//선언과 동시에 문자열로 된 숫자 
		BigInteger ballsp = new BigInteger("1");
		BigInteger sharep = new BigInteger("1");
		BigInteger bmsp = new BigInteger("1");
		
		//리턴할 answer 
		BigInteger answer = new BigInteger("0");
		
		if((balls/2) > share) {
			//조건: balls > (balls-share)
			//그거를 share로 나눔
			for(int i = balls; i > (balls-share); i--){
				//String.valueOf(i): int -> String 형 변환 메서드
				BigInteger index = new BigInteger(String.valueOf(i));
				//변수명.multiply(BigInteger): 곱하기 메서드
				ballsp = ballsp.multiply(index);
			}
			for(int i = share; i > 0; i--) {
				BigInteger index = new BigInteger(String.valueOf(i));
				sharep = sharep.multiply(index);
			}
			//변수명.divide(BigInteger): 나눗셈 메서드
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
		//변수명.intValue(): BigInteger -> int 형변환 메서드
		System.out.println(answer.intValue());
	}

}

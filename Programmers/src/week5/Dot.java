package week5;

public class Dot {

	public static void main(String[] args) {
		/*
		 * x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수
		 * 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 
		 */
		int[] dot = {-1, -3};
		int answer = 0;
		
		if(dot[0] > 0) {
			if(dot[1] > 0)	answer = 1;
			else            answer = 4;
			
		}else {
			if(dot[1] > 0)	answer = 2;
			else            answer = 3;
		}
		
		System.out.println(answer);
	}

}

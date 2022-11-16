package week4;

import java.util.ArrayList;

public class UphillRoad {

	public static void main(String[] args) {
		/*
		 * 12 3 5 7 10 6 1 11.
		 * 이 길에는 2 개의 오르막길이 있다. 
		 * 첫 번째 오르막길의 크기는 7이고, 
		 * 두 번째 오르막길의 크기는 10이다. 
		 * 높이가 12와 6인 곳은 오르막길에 속하지 않는다.
		 * 
		 * 입력
		 * 첫째 줄에 수열의 크기인 N(1 ≤ N ≤ 1000)이 주어진다. 
		 * 둘째 줄엔 N개의 양의 정수 Pi(1 ≤ Pi ≤ 1000)가 주어진다.
		 * 
		 * 출력
		 * 첫째 줄에 가장 큰 오르막길의 크기를 출력한다. 
		 * 만약 오르막길이 없는 경우에는 0을 출력
		 */
		//파라미터
		int n = 8;
		int[] path = {12, 20, 1, 3, 4, 4, 11, 1};
		
		//path[0] - path[1]의 값이 -인 경우 오르막길
		//						 +인 경우 내리막길
		//						 0인 경우 평지
		//음수(오르막길)가 나오다가 양수(내리막길)가 나오는 경우 합계 초기화
		
		int answer = 0; //길의 차이만큼 더해준다 = 오르막길의 크기
		
		ArrayList<Integer> slope = new ArrayList<Integer>();
		
		//연산값이 -인 경우 answer에 더해준다.
		//+(내리막길) 또는 0(평지)이 나오는 경우에는 slope(경사)배열에
		//지금까지 더해온 오르막을 배열에 추가하고 answer는 다시 0으로 초기화한다.
		for(int i = 0; i < path.length-1; i++) {
			if(path[i] - path[i+1] <0) {
				answer += (path[i]-path[i+1]) * -1;
			}else if(path[i] - path[i+1] >= 0) {
				slope.add(answer);
				answer = 0;
				continue;
			}
		}
		
		//slope배열에는 여러개의 오르막길 경사도가 들어가있다.
		//배열의 값을 비교하여 가장 큰 경사도를 가진 데이터를 max에 넣어준다.
		int max = slope.get(0);
		for(int i = 1; i < slope.size(); i++) {
			if(max < slope.get(i)) max = slope.get(i);
		}
		System.out.println(max);
		
	}

}

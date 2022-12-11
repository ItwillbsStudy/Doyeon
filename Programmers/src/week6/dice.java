package week6;

public class dice {

	public static void main(String[] args) {
		/*
		 * 주사위 개수
		 * 직육면체 모양의 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 
		 * 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수
		 * 들어갈 수 있는 주사위의 최대 개수를 return
		 * 
		 * box의 길이는 3입니다.
		 * box[0] = 상자의 가로 길이
		 * box[1] = 상자의 세로 길이
		 * box[2] = 상자의 높이 길이
		 * 1 ≤ box의 원소 ≤ 100
		 * 1 ≤ n ≤ 50
		 * n ≤ box의 원소
		 * 주사위는 상자와 평행하게 넣습니다.
		 */
		
		int[] box = {10, 8, 6}; 
		int n = 3;
		
		int answer = ((box[0] / n) * (box[1] / n)) * (box[2] / n);
		System.out.println(answer);
		
		
	}

}

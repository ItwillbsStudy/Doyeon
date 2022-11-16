package week4;

import java.util.Arrays;

public class MedicalTreatment {

	public static void main(String[] args) {
		/*
		 * 응급도를 기준으로 진료 순서 
		 * 정수 배열 emergency가 매개변수
		 * 응급도가 높은 순서대로 진료 순서를 정한 배열을 return
		 * 
		 * 1 ≤ emergency의 길이 ≤ 10
		 * 1 ≤ emergency의 원소 ≤ 100
		 * 
		 * [3, 76, 24] [3, 1, 2]
		 * [1, 2, 3, 4, 5, 6, 7] [7, 6, 5, 4, 3, 2, 1]
		 * [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
		 */
		// 응급도 파라미터
		int[] emergency = {1, 2, 3, 4, 5, 6, 7};
		
		//emergency 배열은 비교를 위해 두어야하니까 정렬해줄 sort배열 생성
		int[] sort = new int [emergency.length];
		//생성한 sort 배열에 emergency배열의 값을 넣어줌
		for(int i = 0; i < emergency.length; i++) {
			sort[i] = emergency[i];
		}
		//sort 배열 오름차순 정렬
		Arrays.sort(sort);
		
		//내림차순으로 바꿔주기 위해 reverse배열 생성
		int[] reverse = new int[sort.length];
		//sort배열값을 거꾸로 입력해줌
		//sort    0 1 2 3
		//reverse 3 2 1 0
		for(int i = 0, j = sort.length-1; i < reverse.length; i++, j--) {
			reverse[i] = sort[j];
		}
		
		//파라미터로 주어진 emergency배열과 내림차순으로 정렬해준 reverse의 값이 일치할 때
		//그 때 reverse의 인덱스가 응급도 순서이므로 이를 인덱스 배열에 차례차례 넣어준다.
		//단, 인덱스는 0번부터 시작인데 응급도는 1부터 시작이므로 +1을 해준다.
		int[] index = new int[emergency.length];
		for(int i =0; i < emergency.length; i++) {
			for(int j = 0; j < reverse.length; j++ ) {
				if(emergency[i] == reverse[j]) index[i] = j+1;
			}
		}
		
		
	}

}

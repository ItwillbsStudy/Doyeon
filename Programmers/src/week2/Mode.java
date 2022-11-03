package week2;

import java.util.ArrayList;

public class Mode {
	public int solution(int[] array) {
		int answer = 0;

		//arr배열을 생성하여 array 배열 복사
		int[] arr = new int [array.length];
		for(int i = 0; i < array.length; i++) {
			arr[i] = array[i];
		}
		
		
		// arr배열과 array배열을 비교하여 중복되는 숫자가 있을 때마다 count하는 for문 작성함
		// count 횟수를 넣어줄 배열을 만듦 = dcount (그냥 arraylist 써봄)
		// 각각 중복되는 횟수를 count해서 dcount[]배열에 넣음
		ArrayList<Integer> dcount= new ArrayList<Integer>();
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < array.length; j++) {

				if (arr[i] == array[j]) count++;

				if(i > 1) {
					//만약 비교하는 값이 이전에 나왔던 값이면 count를 다시 0으로 초기화
					//예를들어 array가 4,3,3인 경우 dcount는 1,2,0으로 나옴
					for(int n = 0; n < i; n++) {
						if(arr[i] == arr[n]) count = 0;  
					}
				}
			}
			dcount.add(count);//배열에 중복횟수 넣어줌
			count = 0;//다음 비교 전에 다시 0으로 초기화
		}


		//count 배열에서 가장 큰 값 찾기 = 가장 많이 중복된 값
		int max = dcount.get(0);
		int maxi = 0; //중복된 횟수가 가장 높은 인덱스를 저장
		for(int i = 1; i < dcount.size(); i++) {
			if(dcount.get(i) > max) {
				max = dcount.get(i);
				maxi = i;
			}
		}
		
		
		int count2 = 0;//찾아낸 max값이 유일한지 판단하기 위한 count2변수
		//max와 같은 값이 나올 때마다 count2 횟수가 올라가고 그 수가 1이상
		//즉, 중복되면 answer을 -1로 초기화
		for(int i = 1; i < dcount.size(); i++) {
			if (max == dcount.get(i)) count2++;
			if (count2 > 1) answer = -1;
		}
		
		
		//answer가 0이라면 max값이 유일하다는 의미이므로 
		//저장해두었던 max의 인덱스값을 넣은 array값을 리턴
		//array 특정 인덱스의 값과 그 수의 중복된 수를 가지고 있는 dcount의 배열 인덱스는 같다.
		//ex) array[10]의 수가 반복된 수는 dcount[10]이다.
		if(answer == 0) {
			answer = array[maxi];
		}

		return answer;
	}
	public static void main(String[] args) {
//		int[] array = {1, 2, 3, 3, 3, 4, 4, 4};

	}

}

package week5;

import java.util.ArrayList;
import java.util.List;

public class CatchBall {

	public static void main(String[] args) {
		/*
		 * 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있다. 
		 * 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, 
		 * k번째로 공을 던지는 사람의 번호는 무엇인지 return
		 * numbers: [1, 2, 3, 4, 5, 6]	k: 5	result: 3
		 * 0 < k < 1,000
		 */
		//파라미터
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int k = 5;
		
		//numbers 배열을 추가를 반복하기 위한 list 생성
		// 123 123 123 ...
		List<Integer> list = new ArrayList<>();
		
		int answer = 0;
		//index 번호를 증가
		int index = 0;
		
		//k가 0이 될때까지 while문 반복
		while(k != 0) {
			//index번호가 list배열의 크기를 넘어가면 numbers 배열 만큼 추가
			if(index >= list.size()) {
				for(int i = 0; i < numbers.length; i++) {
					list.add(numbers[i]);
				}
			}
			//해당 인덱스의 정수를 저장
			answer = list.get(index);
			//한사람 건너서 던지기 때문에 2씩 증가
			index += 2;
			//k의 수는 하나씩 감소
			k--;
		}
		
		System.out.println(answer);
		
		
	}

}

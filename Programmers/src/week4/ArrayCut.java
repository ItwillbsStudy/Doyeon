package week4;

import java.util.ArrayList;

public class ArrayCut {
	public static void main(String[] args) {
		// 주어지는 파라미터
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		
		//자른 배열을 넣어줄 ArrayList 생성
		//일반 배열로 생성 시 (num2 - num1) + 1 크기로 생성
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		//배열의 인덱스가 num1부터 num2까지의 값을 추가
		for(int i = num1; i < num2 + 1; i++) {
			answer.add(numbers[i]);
		}

		//프로그래머스 제출하니까 int타입으로 제출하라해서
		//같은 사이즈의 int[]을 만들고 그대로 복사해서 제출함
		int[] answerArray = new int [answer.size()];

		for(int i = 0; i < answerArray.length; i++) {
			answerArray[i] = answer.get(i);
		}

	}
}

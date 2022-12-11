package week6;

import java.util.ArrayList;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		/*
		 * 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return
		 * 1 ≤ my_string의 길이 ≤ 100
		 * my_string에는 숫자가 한 개 이상 포함되어 있습니다.
		 * my_string은 영어 소문자 또는 0부터 9까지의 숫자
		 * "hi12392" [1, 2, 2, 3, 9]
		 */
		
		String my_string = "hi12392";
		
		char[] ch = my_string.toCharArray();
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0; i < ch.length; i++) {
			if(ch[i] >= '0' && ch[i] <= '9') {
				list.add((int)ch[i] - 48);
			}
		}
		list.sort((o1, o2) -> o1 - o2);
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
		
	}
}

package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterRepetition {

	public static void main(String[] args) {
		/*
		 * 문자열 my_string과 정수 n이 매개변수
		 * 각 문자를 n만큼 반복한 문자열을 return
		 * 
		 * 2 ≤ my_string 길이 ≤ 5
		 * 2 ≤ n ≤ 10
		 */
		// 문자와 숫자 받아오기
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int n = sc.nextInt();
		
//		String my_string = "hello";
//		int n = 3;
		
		//toCharArray() method
		//문자열을 한글자씩 char문자로 바꿔주는 메서드
		//char 배열을 생성하여 저장
		char[] ch = my_string.toCharArray();
		
		//n이 몇개일지 모르니까 ArrayList로 추가
		ArrayList<Character> answer = new ArrayList<Character>();
		
		//ch배열 인덱스 하나당 n번 반복하여 하나씩 추가
		for(int i = 0; i < ch.length; i ++) {
			for(int j = 0; j < n; j++) {
				answer.add(ch[i]);
			}
		}
		
		//answer배열에 저장된 문자를 다시 문자열로 변환
		String repetition = "";
		for(int i = 0; i < answer.size(); i ++) {
			repetition += answer.get(i);
		}
		
		// 문자열 출력
		System.out.println(repetition);
		
		
	}

}

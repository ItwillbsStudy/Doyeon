package week4;

import java.util.ArrayList;

public class AlienPlanet {
	public static void main(String[] args) {
		/*
		 * 나이를 알파벳으로 말한다. 
		 * a는 0, b는 1, c는 2, ..., j는 9입니다. 
		 * 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
		 * 나이 age가 매개변수로 주어질 때 나이를 return
		 */

		// a=0 b=1 c=2 d=3 e=4 f=5 g=6 h=7 i=8 j=9

		//파라미터
		int age = 51;

		//최대 4자리 수이므로 4 크기의 배열 생성
		int[] number = new int[4];
		String answer = "";

		//age를 나누어 한 자리씩 얻어 차례대로 number 배열에 넣음
		// ex) 51 -> 0 0 5 1
		//	   999 -> 0 9 9 9
		int num = 1000;
		int rest = 0;

		for(int i = 0; i < number.length; i++) {
			rest= age / num;
			number[i] = rest;
			age = age % num;
			num /= 10;
		}


		// number 배열을 그대로 switch에 돌리면
		// 51 -> 0 0 5 1-> a a f b가 나옴
		// 0을 제거하거나 다른 수로 대체 시, 201 같은 수가 제대로 나오지 않음
		// 처음으로 수가 등장하는 인덱스를 알기 위한 for문
		// number[index]가 0 이상일때의 index를 저장
		int index = 0;

		N:
			for(int i = 0; i < number.length; i++) {
				if(number[i] > 0) {
					index = i;
					break N;
				}
			}

		//메서드로 리턴받은 answer값을 출력
		System.out.println(alphabet(number, index, answer));

	}
	//Method
	// number배열과 처음으로 숫자가 등장하는 index를 전달
	// 각각의 수에 맞는 알파벳을 전달받은 answer에 더하여 리턴한다.
	public static String alphabet(int[] number, int index, String answer) {

		for(int i = index; i < number.length; i++) {
			switch (number[i]) {
			case 1: answer += "b";
			break;
			case 2: answer += "c";
			break;
			case 3: answer += "d";
			break;
			case 4: answer += "e";
			break;
			case 5: answer += "f";
			break;
			case 6: answer += "g";
			break;
			case 7: answer += "h";
			break;
			case 8: answer += "i";
			break;
			case 9: answer += "j";
			break;

			default: answer+= "a";
			break;
			}
		}
		return answer;
	}
}

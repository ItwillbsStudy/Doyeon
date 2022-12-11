package week6;

public class RemoveVowel {

	public static void main(String[] args) {
		/*
		 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음
		 * 문자열 my_string이 매개변수
		 * 모음을 제거한 문자열을 return
		 * "nice to meet you"	"nc t mt y"
		 */
		
		String my_string = "nice to meet you";
		
		
//		while(true) {
//			
//		}
		
		String answer = my_string.replace("a", "");
		answer = answer.replace("e", "");
		answer = answer.replace("i", "");
		answer = answer.replace("o", "");
		answer = answer.replace("u", "");
		
		System.out.println(answer);
	}

}

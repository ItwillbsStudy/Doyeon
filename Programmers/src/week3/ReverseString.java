package week3;

public class ReverseString {

	public static void main(String[] args) {
		/* <문제>
		 * 문자열 my_string이 매개변수 
		 * 거꾸로 뒤집은 문자열을 return
		 */
		
		String my_string = "bread";
		
		// 문자를 나눠주는 split method 사용!
		// split메서드를 호출하고 이를 split이라는 배열에 저장
		String[] split = my_string.split(""); 
		
		// 답으로 제출할 배열 생성
		String[] answer = new String [split.length];
		
		//answer[0]에 split 마지막 인덱스의 값을 저장[split.lenth - 1]
		//answer[1]에 split 마지막 인덱스의 값을 저장[split.lenth - 2]
		
		for(int i = 0, j = answer.length-1; i < split.length; i++, j--) {
			answer[i] = split[j];
		}
		
		// 배열에 저장되어 있는 문자들을 다시 문자열로 합치기
		//String reverse = answer[0] + answer[1];
		
		String reverse = "";
		for(int i = 0; i < answer.length; i ++) {
			reverse += answer[i];
		}
		
		System.out.println("바뀐 문자열: " + reverse);
		
		//------------생성된 배열 확인용------------
//		// 원래 문자열 출력
//		for(String spl : split) {
//			System.out.print(spl + " / ");
//		}
//		
//		System.out.println();
//		System.out.println("--------------------");
//		
//		// 뒤집힌 문자열 출력
//		for(String spl : answer) {
//			System.out.print(spl + " / ");
//		}
		
		
	}

}

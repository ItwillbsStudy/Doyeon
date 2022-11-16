package week4;

public class removeCharacter {

	public static void main(String[] args) {
		/*
		 * 주어진 letter와 my_string의 문자열과 겹치는 문자를 제거한 문자열을 return
		 * 대소문자 구분함
		 */
		
		//파라미터
		String my_string = "ssSSSsssSSS";
		String letter = "S";
		String answer = "";
		
		//String split 메서드 사용 시, 비슷하지만 대소문자 구분없이 제거됨..
		//하지만 char은 내부적으로 int형으로 저장하기 때문에 비교 시 대소문자 구분이 가능
		
		//주어진 문자열을 char 배열로 바꿔주는 toCharArray() 메서드 사용하여
		//배열 생성
		char[] chArr = my_string.toCharArray();
		
		//char 배열과 비교하기 위해서 String을 char로 바꿔주는 charAt(int index) 메서드 사용
		// 예를 들어 String str = "Hello" -> str.charAt(2); -> e
		// 입력한 인덱스의 순서에 해당하는 문자열을 문자로 바꾸어준다.
		//letter가 한글자이므로 0으로 설정
		char ch = letter.charAt(0);
		
		// char배열의 인덱스와 ch가 같은 인덱스는 넘어가고 다른 인덱스만 answer에 저장
		// answer은 String 타입이므로 + ""
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ch ) {
					continue;
			}else {
				answer += chArr[i] + "";
			}
		}
		
		System.out.print(answer);
	}

}

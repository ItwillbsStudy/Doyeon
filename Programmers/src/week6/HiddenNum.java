package week6;

public class HiddenNum {

	public static void main(String[] args) {
		/*
		 * my_string안의 모든 자연수들의 합을 return
		 * 1 ≤ my_string의 길이 ≤ 1,000
		 * my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성
		 * "aAb1B2cC34oOp"	10
		 */
		
		String my_string = "aAb1B2cC34oOp";
		
		char[] ch = my_string.toCharArray();
		
		int answer = 0;
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] >= '0' && ch[i] <= '9') {
				answer += (int)ch[i] - 48;
			}
		}
		
		System.out.println(answer);
	}

}

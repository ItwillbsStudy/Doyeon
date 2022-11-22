package week5;

public class MorseCode {
	
	public static void main(String[] args) {
		
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
						 ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
						 "...","-","..-","...-",".--","-..-","-.--","--.."};
		
		//파라미터
		String letter = ".... . .-.. .-.. ---";
		
		String[] str = letter.split(" ");
		
		String answer = "";
		
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < morse.length; j++) {
				if(str[i].equals(morse[j])) {
					answer += (char)(j + 97) + "";
				}
			}
	
		}
		
		System.out.println(answer);
		
	}
}

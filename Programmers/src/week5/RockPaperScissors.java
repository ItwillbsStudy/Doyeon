package week5;

public class RockPaperScissors {

	public static void main(String[] args) {
		/*
		 *  가위는 2 바위는 0 보는 5 
		 *  가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수
		 *  rsp에 저장된 가위 바위 보를 모두 이기는 경우
		 *  문자열을 return
		 */
		
		//파라미터
		String rsp = "205"; //return 052
		//return 값
		String answer = "";
		
		char[] ch = rsp.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case '2': answer += "0"; break;
			case '0': answer += "5"; break;
			case '5': answer += "2"; break;
			}
		}
		System.out.println(answer);
	}

}

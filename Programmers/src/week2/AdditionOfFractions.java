package week2;

public class AdditionOfFractions {

	public int[] solution(int denum1, int num1, int denum2, int num2) {
		int topNum = num1*denum2 + num2*denum1;

		int botNum = num1*num2;

		int maximum = 1;

		for(int i = 1 ; i <= topNum ; i ++) {
			if(topNum % i == 0 && botNum % i == 0) {
				maximum = i;
			}
		}
		int[] answer = 	{topNum/maximum, botNum/maximum};
		return answer;
	}


	public static void main(String[] args) {
	}

}

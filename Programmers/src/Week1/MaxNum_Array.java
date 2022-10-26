package Week1;

public class MaxNum_Array {
	
	public int solution(int[] numbers) {
		
		int max = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] > max) max = numbers[i];
		}
		int m = 0;
		int max2 = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			m = max2;
			if(numbers[i] > max2) max2 = numbers[i];
			if(max == max2) max2 = m;
		}
		return max * max2;
	}
}


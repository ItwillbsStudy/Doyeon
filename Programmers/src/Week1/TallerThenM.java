package Week1;

public class TallerThenM {
	
	public int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > height) answer++;
        }
        return answer;
    }
}

package week5;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// 주어진 파라미터
		int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		int n = 3;
		
		int[][] answer = new int[num_list.length/n][n];
		
		int index = 0;
		
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer[i].length; j++) {
				answer[i][j] = num_list[index];
				index++;
			
			}
		}
		
		for(int[]ans : answer) {
			for(int a : ans) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}

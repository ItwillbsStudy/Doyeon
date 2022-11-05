package week3;

public class ReverseArray {

	public static void main(String[] args) {
		/* <문제>
		 * 정수가 들어 있는 배열 num_list가 매개변수 
		 * 순서를 거꾸로 뒤집은 배열을 return
		 */
		int[] num_list = {1, 2, 3, 4, 5};
		int[] answer = new int[num_list.length];
		
		// answer[0]에 num_list[num_list.length - 1]
		// answer[1]에 num_list[num_list.length - 2]
		// answer의 인덱스는 1씩 증가, num_list의 인덱스는 1씩 감소
		
		for(int i = 0, j = num_list.length - 1; i < num_list.length; i++, j--) {
			answer[i] = num_list[j];
		}
		
		
		for(int a : answer) {
			System.out.println(a);
		}
		
	}

}

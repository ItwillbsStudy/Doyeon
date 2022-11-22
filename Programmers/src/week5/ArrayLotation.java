package week5;

public class ArrayLotation {

	public static void main(String[] args) {
		/*
		 * 정수가 담긴 배열 numbers와 문자열 direction(right/left)이 매개변수
		 * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return
		 */
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left" ;
		
		// numbers 배열의 2배 길이의 배열 생성
		int[] arr = new int[numbers.length * 2];
		// numbers배열의 값을 arr배열에 하나씩 차례대로 삽입
		for(int i = 0, j = 0; i < arr.length; i++, j++) {
				//numbers 배열의 인덱스가 끝나면 다시 0으로 초기화해서 한번 더 넣어줌
				if(j == numbers.length) j = 0;
				arr[i] = numbers[j];
		}
		
		//리턴할 answer 배열을 numbers 배열의 크기만큼 생성
		int[] answer = new int[numbers.length];
		
		switch (direction) {
		case "left":
			//한칸씩 밀려서 들어가니까 다음 인덱스(i+1)값 넣어줌
			for(int i = 0; i < answer.length; i++) {
				answer[i] = arr[i+1];
			}
			break;
			
		case "right":
			//가장 끝에 있는 인덱스 번호가 제일 첫번째 인덱스로 오고 그 뒤에 쭉쭉
			//answer[0]에 numbers[numbers.length-1]이 오기때문에
			//arr의 인덱스 시작을 numbers.length-1로 설정
			for(int i = 0, j = (numbers.length-1); i < answer.length; i++, j++) {
				answer[i] = arr[j];
			}
			break;
		}
		
		for(int a : answer) {
			System.out.print(a + " ");
		}
	}

}

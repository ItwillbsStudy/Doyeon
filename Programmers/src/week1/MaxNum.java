package week1;

public class MaxNum {
	public int solution(int[] numbers) {
		//배열의 두 원소를 곱했을 때 최대값을 구하는 문제로 배열에 
		//중복된 숫자가 들어갈 수 있으므로 두번째로 큰 수를 구한다고 생각하면
		//틀린 답이 나온다.
		
		
 		int max = numbers[0];
// 		for(int i = 1; i < numbers.length; i++) {
// 			if(numbers[i] > max) max = numbers[i];
// 		}
// 		int m = 0;
 		int max2 = numbers[0];
// 		for(int i = 1; i < numbers.length; i++) {
// 			m = max2;
// 			if(numbers[i] > max2) max2 = numbers[i];
// 			if(max == max2) max2 = m;
// 		}
// 		return max * max2;
		//배열에 중복된 수가 입력이 되면 수가 입력이 되지않아 틀림
		//두번째 큰 수로 질문을 이해해서 틀린 코드됨
		//{0,5,5,5}인 경우 max=5 max2=5로 25가 되어야 하는데
		//max=5, max2=0이 되므로 틀린답이 된다.
		
//		int max = numbers[0];
//              int max2 = numbers[0];
//              for(int i = 1; i < numbers.length; i++) {
//                      if(numbers[i] > max) {
//                              max = numbers[i];
//                      }else {
//                      	if(numbers[i] > max2) max2 = numbers[i];
//          		}
//       	 } 
 		return max * max2;
		//위와 같은 이유로 틀린 답
		
	}
}

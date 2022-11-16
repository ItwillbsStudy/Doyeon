package week4;

public class MakeItOne {

	public static void main(String[] args) {
		/*
		 * 정수 X에 사용할 수 있는 연산
		 * 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
		 * 2. X가 2로 나누어 떨어지면, 2로 나눈다.
		 * 3. 1을 뺀다.
		 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 
		 * 연산을 사용하는 횟수의 최솟값을 출력하시오.
		 * 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다
		 */

		//파라미터 
		int number = 10; //최소값: 3
		
		//-1을 맨 처음에 해주는냐(count2) VS 나눗셈 다음에 해주느냐(count1)의 차이로 횟수가 나뉘어진다.
		//각각 연산을 할때마다 횟수를 count한 정수를 비교하여 더 작은 수 출력
		
		//count1은 2나 3으로 나눗셈을 먼저 한 후 -1 연산
		int count1 = 0; 
		count1 = operation(count1, number);

		//count2는 -1을 무조건 한 번 한 뒤에 나눗셈을 하거나 -1을 해주거나 한다.
		int count2 = 0;
		//number가 1인 경우에는 연산을 하지않고 count2가 0이 되도록 
		//1이 아닌 경우에만 진행되는 if문 작성
		if(number != 1) {
			//먼저 -1 연산을 한다.
			number -= 1;
			count2++;
			//그 다음 나눗셈이나 -1을 하는 메서드 
			count2 = operation(count2, number);
		}
		
		//count1과 count2 중에서 최소값을 구한다.
		System.out.println(Integer.min(count1, count2));
	}
	
	//연산 메서드
	//3이나 2로 나눌 수 있으면 나누고 안 되면 -1을 하는 메서드
	public static int operation(int count, int number) {
		ONE:
			while(number != 1) {
				
				if(number == 1) {
					break ONE;
				}
				
				if(number % 3 == 0) {
					number /= 3;
					count++;
				}else if(number % 2 == 0) {
					number/=2;
					count++;
				}else {
					number -= 1;
					count++;
				}
			}
		return count;
	}

}

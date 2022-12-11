package week6;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * 3628800 -> 10
		 * 7 -> 3
		 */
		int n = 24;
		
		int answer = 1;
		
		int fac = 1;
		
		while(answer <= n) {
			fac++;
			answer *= fac;
		}
		
		System.out.println(fac-1);
		
		
	}

}

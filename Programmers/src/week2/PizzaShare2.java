package week2;

public class PizzaShare2 {

	public static void main(String[] args) {
		int n = 15, i = 1;
		int answer = 0;
		while(true) {
            answer = 6 * i;
            if (answer % n == 0) break;
            i += 1;
        }
		System.out.println(answer / 6);
	}

}

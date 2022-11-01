package week2;
import java.util.Arrays; 

public class ArrayMedian {
	public int solution(int[] array) {
		Arrays.sort(array);
		return array[array.length / 2];
	}
}

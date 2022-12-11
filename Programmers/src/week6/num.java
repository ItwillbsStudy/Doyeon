package week6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class num {

	public static void main(String[] args) {
		/*
		 * 소인수분해란 어떤 수를 소수들의 곱으로 표현
		 * 예를 들어 12를 소인수 분해하면 2 * 2 * 3 => 12의 소인수는 2와 3 
		 * 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return
		 * 420	[2, 3, 5, 7]
		 */
		
		int n = 420;
		int i = 2;
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(i <= n) {
			if(n % i == 0) {
				n /= i;
				list.add(i);
			}else {
				i++;
			}
		}
		
//		Set<Integer> set = new HashSet<Integer>(list);
//		System.out.println(set);
//		List<Integer> listSet = new ArrayList<Integer>(set);
//		
//		System.out.println(listSet);
//		
//		int[] answer = new int[listSet.size()];
//		
//		for(int j = 0; j < listSet.size(); j++) {
//			answer[j] = listSet.get(j);
//		}
//		
//		for(int num : answer) {
//			System.out.println(num);
//		}
		
		Set<Integer> set = new HashSet<Integer>(list);
		System.out.println(set);
		Integer[] arr = set.toArray(new Integer[set.size()]);
		int[] answer = new int[arr.length];
		
		for(int j = 0; j < answer.length; j++) {
			answer[j] = arr[j];
		}
		
		for(int num : answer) {
			System.out.println(num);
		}
		
	}

}

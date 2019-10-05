package Programmers_12945;

public class Solution {
	public int solution(int n) {
		int answer = 0;
		int[] fibo = new int[100001];
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2 ; i < 100001 ; i++) {
			fibo[i] = (fibo[i-1] + fibo[i-2] ) % 1234567;
		}
		
		answer= fibo[n];
		
		return answer;
	}

}

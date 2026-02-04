package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int [] a = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int s = 0; s < N; s++) {
			a[s] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		int cnt = 0;
		int sum = 0;
		int i = 0;
		int j = N-1;
		
		while(i<j) {
			sum = a[i] + a[j];
			if (sum > M) {
				j--;
			}
			else if (sum < M) {
				i++;
			}
			else if (sum == M) {
				cnt ++;
				j--;
				i++;
			}
		}
		System.out.println(cnt);
	}
}

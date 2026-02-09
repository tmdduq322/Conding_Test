package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[2 *123456 + 1];
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		prime[0] = prime[1] = false;
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				for (int j = i * i; j <= prime.length; j += i) {
					prime[j] = false;
				}
			}
		} 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		while(n != 0) {
			int cnt = 0;
			for (int i = n+1; i <= 2 * n; i++) {
				if (prime[i]) {
					cnt ++;
				}
			}
			sb.append(cnt).append("\n");
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
		}
		System.out.println(sb);
		br.close();
	}
}

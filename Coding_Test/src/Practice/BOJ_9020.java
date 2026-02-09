package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[10001];
		for (int i = 0; i < prime.length; i++) {//체 구현
			prime[i] = true;
		}
		prime[0] = prime[1] = false;
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				for (int j = i * i; j <= 10000; j += i) {
					prime[j] = false;
				}
			}
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int q = m/2;
			int p = q;
			while(q != 1) {// m을 2로 나눈(p,q)룰 각각 +1,-1로 벌려가며 조건에 맞는지 확인
				if(prime[p] && prime[q]) {
					sb.append(q).append(" ").append(p).append("\n");
					break;
				}
				else {
					p++;
					q--;
				}
			}
		}
		System.out.println(sb);
		br.close();
	}
}

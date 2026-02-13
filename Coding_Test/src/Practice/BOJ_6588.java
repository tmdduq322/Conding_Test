package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6588 {
	static boolean [] prime = new boolean [1000001];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < prime.length ; i++) {
			prime[i] = true;
		}
		prime[0] = prime[1] = false;
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				for(int j = i*i; j <= prime.length - 1 ; j +=i) {
					prime[j] = false;
				}
			}
		}
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (n == 0) {
				break;
			}
			Gb(n);
		}
		System.out.println(sb);
	}
	
	public static void Gb(int n) {
		boolean exist = false;
		for (int i = 3; i <= n/2; i += 2) {
			if(prime[i] && prime[n-i]) {
				sb.append(n).append(" = ").append(i).append(" + ").append(n-i).append("\n");
				exist = true;
				break;
			}
		}
		if (!exist) {
			sb.append("Goldbach's conjecture is wrong.");
		}
	}
	
}

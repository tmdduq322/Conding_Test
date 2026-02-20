package Practice;

import java.util.Scanner;

public class BOJ_17103 {
	static boolean[] prime = new boolean [1000001];
public static void main(String[] args) {
	for (int i = 0; i < prime.length; i++) {
		prime[i] = true;
	}
	prime[0] = prime[1] = false;
	for (int i = 2; i <= Math.sqrt(prime.length); i++) {
		if(prime[i]) {
			for (int j = i * i; j <= prime.length-1; j+=i) {
				prime[j] = false;
			}
		}
	}
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	int T = sc.nextInt();
	for (int i = 0; i < T; i++) {
		int n = sc.nextInt();
		int cnt = 0;
		int a = n/2;
		int b = n/2;
		while(b > 1) {
			if (prime[a] && prime[b]) {
				cnt ++;
			}
			a += 1;
			b -= 1;
		}
		sb.append(cnt).append("\n");
	}
	sc.close();
	System.out.println(sb);
}
}

package Practice;

import java.util.Scanner;

public class BOJ_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean [] prime = new boolean[N+1]; // 에라토스테네스의 체 배열
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		prime[1] = prime[0] = false;
		for (int i = 2; i <= Math.sqrt(N); i++) { //2부터 N제곱근 내의 숫자 순환
				for (int j = i*i; j<=N ; j += i) { // 소수이면 제곱부터 i를 곱해서 순환
					prime[j] = false;
				}
			}
		for (int i = M; i <= N; i++) {
			if(prime[i]) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}

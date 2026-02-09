package Practice;

import java.util.Scanner;

public class BOJ_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean [] prime = new boolean[1001]; // 에라토스테네스의 체 배열
		int cnt = 0;
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		prime[1] = prime[0] = false;
		int N = sc.nextInt();
		for (int i = 2; i < Math.sqrt(1001); i++) { //2부터 N제곱근 내의 숫자 순환
				for (int j = i*i; j<=1000 ; j += i) { // 소수이면 제곱부터 i를 곱해서 순환
					prime[j] = false;
				}
			}
		
		for (int i = 0; i < N; i++) {
			if(prime[sc.nextInt()]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
	
}

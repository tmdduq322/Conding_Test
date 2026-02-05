package Practice;

import java.util.Scanner;

public class BOJ_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		while(N>0) {
			if (N == 4|N == 7) {
				N = 0;
				cnt = -1;
				break;
			}
			else if(N%3 != 0 && N%5 != 0 || N%5 == 0) {
				N -=5;
				cnt ++;
			}
			else if (N%3 == 0) {
				N -=3;
				cnt ++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}
}

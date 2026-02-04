package Practice;

import java.util.Scanner;

public class BOJ_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		if (M<45) {
			M += 60;
			H --;
		}
		if (H == -1) {
			H = 23;
		}
		M -= 45;
		System.out.printf("%d %d\n",H,M);
	}

}

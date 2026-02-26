package Practice;

import java.util.Scanner;

public class BOJ_10870 {
public static void main(String[] args) {
	int fibo [] = new int[21];
	Scanner sc = new Scanner(System.in);
	fibo[0] = 0;
	fibo[1] = 1;
	for (int i = 2; i <= 20; i++) {
		fibo[i] = fibo[i-1] + fibo[i-2];
	}
	System.out.println(fibo[sc.nextInt()]);
	sc.close();
}
}

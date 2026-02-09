package Practice;

import java.util.Scanner;

public class BOJ_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int orga = a;
		int orgb = b;
		while(b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		System.out.println(a);
		System.out.println((orga * orgb) / a);
		sc.close();
	}
}

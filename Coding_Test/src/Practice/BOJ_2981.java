package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2981 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	ArrayList<Integer> al = new ArrayList<Integer>();
	int N = sc.nextInt();
	int [] Ai = new int[N];
	for (int i = 0; i < N; i++) {
		Ai[i] = sc.nextInt();
	}
	Arrays.sort(Ai);
	int gcd = Ai[1] - Ai[0];
	
	for (int i = 1; i < N-1 ; i++) {
		gcd = getGCD(gcd,Ai[i+1] - Ai[i]);
	}
	for (int i = 2; i <= Math.sqrt(gcd) ; i++) {
		if(gcd % i == 0) {
			al.add(i);
			if (i * i !=gcd) {
				al.add(gcd / i);
			}
		}
	}
	al.add(gcd);
	Collections.sort(al);
	
	for(int val : al) {
		sb.append(val).append(" ");
	}
	System.out.println(sb);
}

public static int getGCD(int a, int b) {
	while(b != 0) {
		int r = a % b;
		a = b;
		b = r;
	}
	return a;
}
}

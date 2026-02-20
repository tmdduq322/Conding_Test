package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17087 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int N = Integer.parseInt(st.nextToken());
	long S = Long.parseLong(st.nextToken());
	st = new StringTokenizer(br.readLine());
	long gcd = Math.abs(Long.parseLong(st.nextToken())-S);
	for (int i = 0; i < N-1; i++) {
		long dis = Math.abs(Long.parseLong(st.nextToken())-S);
		gcd = getGCD(gcd,dis);
	}
	System.out.println(gcd);
}

public static long getGCD(long a, long b) {
	while(b != 0) {
		long r = a % b;
		a = b;
		b = r;
	}
	return a;
}
}

package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_2824 {
public static void main(String[] args) throws IOException {
	BigInteger A = new BigInteger("1");
	BigInteger B = new BigInteger("1");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int n = Integer.parseInt(st.nextToken());
	st = new StringTokenizer(br.readLine());
	for (int i = 0; i < n; i++) {
		A = A.multiply(new BigInteger(st.nextToken()));
	}
	st = new StringTokenizer(br.readLine());
	int m = Integer.parseInt(st.nextToken());
	st = new StringTokenizer(br.readLine());
	for (int i = 0; i < m; i++) {
		B = B.multiply(new BigInteger(st.nextToken()));
	}
	String R = A.gcd(B).toString();
	if (R.length() > 9) {
		System.out.println(R.substring(R.length()-9));
	}
	else {
		System.out.println(R);
	}
}
}

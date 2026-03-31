package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1431_2 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(br.readLine());
	String arr [] = new String[N];
	for (int i = 0; i < N; i++) {
		arr[i] = br.readLine(); 
	}
	Arrays.sort(arr,(a,b) -> {
		if (a.length() != b.length()) {
			return a.length() - b.length();
		}
		
		int aSum = getSum(a);
		int bSum = getSum(b);
		if (aSum != bSum) {
			return aSum - bSum;
		}
		return a.compareTo(b);
	});
	for (int i = 0; i < arr.length; i++) {
		sb.append(arr[i]).append("\n");
	}
	System.out.println(sb);
}

public static int getSum(String s) {
	int sum = 0;
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if('0' <= c && c <= '9') {
			sum += (int)c - '0';
		}
	}
	return sum;
}
}

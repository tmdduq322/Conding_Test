package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_1431 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	String[] arr = new String[N];
	for (int i = 0; i < N; i++) {
		arr[i] = br.readLine();
	}
	Arrays.sort(arr,new Comparator<String>(){
		public int compare(String s1, String s2) {
			if(s1.length() != s2.length()) {
				return s1.length() - s2.length();
			}
			else {
				int s1int = intSum(s1);
				int s2int = intSum(s2);
				if(s1int != s2int) {
					return s1int - s2int;
				}
				else {
					int result = s1.compareToIgnoreCase(s2);
					if (result != 0) {
					    return result;
					}
				}
			}
			return 1;
		}
	});
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < arr.length; i++) {
		sb.append(arr[i]).append("\n");
	}
	System.out.println(sb);
}

public static int intSum(String s) {
	int sum = 0;
	char[] intString = s.replaceAll("[^\\d]", "").toCharArray();
	for (int i = 0; i < intString.length; i++) {
		sum += intString[i]- '0';
	}
	return sum;
}
}

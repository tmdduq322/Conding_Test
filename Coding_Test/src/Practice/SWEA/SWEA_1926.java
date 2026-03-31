package Practice.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1926 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int n = Integer.parseInt(br.readLine());
	for (int i = 1; i <= n; i++) {
		String s = String.valueOf(i);
		if(s.contains("3") || s.contains("6")||s.contains("9")) {
			int cnt = 0;
			for (int j = 0; j < s.length(); j++) {
				char tmp  = s.charAt(j);
				if(tmp == '3'||tmp == '6'||tmp == '9') {
					cnt++;
				}
			}
			while(cnt-- > 0) {
				sb.append("-");
			}
		}
		else {
			sb.append(s);
		}
		sb.append(" ");
	}
	System.out.println(sb);
}
}

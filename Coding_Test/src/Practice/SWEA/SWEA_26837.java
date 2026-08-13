package Practice.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SWEA_26837 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			String S = st.nextToken();
			int rst = 0;
			int AT = 0; int GC = 0;
			HashMap<Long, Integer> hm = new HashMap<>();
			hm.put(5001L * 20000L + 5001L, 1);
			for(char c : S.toCharArray()) {
				if(c == 'A') AT++;
				else if( c == 'T') AT--;
				else if(c == 'G') GC ++;
				else if(c == 'C') GC--;
				long key = (AT + 5001)*20000 + GC + 5001;
				int cnt = hm.getOrDefault(key, 0);
				rst += cnt;
				hm.put(key, cnt+1);
			}
			sb.append(rst).append("\n");
		}
		System.out.println(sb);
	}
}

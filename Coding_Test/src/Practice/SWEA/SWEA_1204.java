package Practice.SWEA;

import java.io.*;
import java.util.*;

public class SWEA_1204 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int T = Integer.parseInt(br.readLine());
	StringTokenizer st;
	for (int tc = 1; tc <= T; tc++) {
		Map<Integer,Integer> hm = new HashMap<>();
		br.readLine();
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int key = Integer.parseInt(st.nextToken());
			hm.put(key,hm.getOrDefault(key, 0) + 1);
		}
		List<Integer> valueList =new ArrayList<>(hm.values());
		valueList.sort(Collections.reverseOrder());
		int target = valueList.get(0);
		int max = 0;
		for(int key : hm.keySet()) {
			if(hm.get(key) == target ) {
				max = Math.max(max,key);
			}
		}
		sb.append("#" + tc + " " + max + "\n");
	}
	System.out.println(sb);
}
}

package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2750 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	ArrayList<Integer> al = new ArrayList<Integer>();
	int N = Integer.parseInt(br.readLine());
	for (int i = 0; i < N; i++) {
		al.add(Integer.parseInt(br.readLine()));
	}
	Collections.sort(al);
	for (int j = 0; j < al.size(); j++) {
		sb.append(al.get(j)+"\n");
	}
	System.out.println(sb);
}
}

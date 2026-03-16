package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1074 {
static int cnt = 0;
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	int r = Integer.parseInt(st.nextToken());
	int c = Integer.parseInt(st.nextToken());
	int size = (int) (Math.pow(2, N));
	find(size,r,c);
	System.out.println(cnt);
	
}
public static void find(int size, int r, int c) {
	if (size == 1) {
		return;
	}
	size /= 2;
	if (r < size && c < size) { // 2사분면
		find(size,r,c);
	}
	else if(size <= r && size <= c) { //4사분면
		cnt += (size * size) * 3;
		find(size,r-size,c-size);
	}
	else if(size <= r && c < size) { //3사분면
		cnt += (size * size) * 2;
		find(size,r-size,c);
	}
	else if(r < size && size <= c) { //1사분면
		cnt += size * size;
		find(size,r,c-size);
	}
}
}

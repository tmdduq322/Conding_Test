package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1780 {
	static int cnt0,cnt1,cnt = 0;
	static int [][] arr;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int n = Integer.parseInt(br.readLine());
	arr = new int[n][n];
	for (int i = 0; i < n; i++) {
		st = new StringTokenizer(br.readLine());
		for (int j = 0; j < n; j++) {
			arr[i][j] = Integer.parseInt(st.nextToken());
		}
	}
	find(0,0,n);
	System.out.println(cnt+"\n"+cnt0+"\n"+cnt1);
}
public static void find(int x, int y, int n) {
	if(check(x,y,n)) {
		if(arr[y][x] == -1) {
			cnt ++;
		}
		else if(arr[y][x] == 0) {
			cnt0 ++;
		}
		else {
			cnt1 ++;
		}
		return;
	}
	int newn = n/3;
	
	find(x,y,newn);
	find(x+newn,y,newn);
	find(x+(newn*2),y,newn);
	find(x,y+newn,newn);
	find(x,y+(newn*2),newn);
	find(x+newn,y+newn,newn);
	find(x+(newn*2),y+newn,newn);
	find(x+newn,y+(newn*2),newn);
	find(x+(newn*2),y+(newn*2),newn);
}

public static boolean check(int x, int y,int n) {
	int c = arr[y][x];
	for (int i = y; i < y+n; i++) {
		for (int j = x; j < x+n; j++) {
			if (c != arr[i][j]) {
				return false;
			}
		}
	}
	return true;
}

}

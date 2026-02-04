package Practice;
import java.util.*;
public class BoJ_2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int cnt = 1;
		int sum = 1;
		int start = 1;
		int end = 1;
		while (end !=n) {
			if (sum ==n) {
				cnt ++;
				sum = sum - start;
				start ++;
			}
			else if (sum<n) {
				end ++;
				sum = sum+end;
			}
			else if (sum>n) {
				sum = sum - start;
				start ++;
			}
		}
		System.out.println(cnt);
	}

}

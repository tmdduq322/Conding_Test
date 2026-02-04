package Practice;
import java.util.Scanner;
public class BOJ_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int [] score = new int[c];
		int max = 0;
		int sum = 0;
		for (int j = 0; j < c; j++) {
			score[j] = sc.nextInt();
			max = Math.max(max, score[j]);
			sum += score[j];
		}
		System.out.println((double)sum*100/max/c); 
	}
}

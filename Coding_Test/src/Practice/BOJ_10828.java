package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10828 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> al = new ArrayList<Integer>();
	int num = sc.nextInt();
	while(num != 0) {
		String cmd = sc.next();
		switch(cmd) {
		case "push" :
			int putn = sc.nextInt();
			al.add(putn);
			break;
			
		case "pop" :
			if(al.isEmpty()) {
				System.out.println(-1);
				break;
			}
			System.out.println(al.get(al.size()-1));
			al.remove(al.size()-1);
			break;
			
		case "size":
			System.out.println(al.size());
			break;
			
		case "empty":
			if(al.isEmpty()) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
			break;
			
		case "top":
			if(al.isEmpty()) {
				System.out.println(-1);
				break;
			}
			System.out.println(al.get(al.size()-1));
			break;
		}
		num--;
		
	}
	sc.close();
}
}

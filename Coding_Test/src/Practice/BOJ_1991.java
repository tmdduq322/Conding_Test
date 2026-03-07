package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
	char value;
	Node left;
	Node right;
	public Node(char value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class BOJ_1991 {
	static Node[] tree;
	static StringBuilder sb = new StringBuilder();

public static void preorder(Node n) {
	if (n == null) return;
	sb.append(n.value);
	preorder(n.left);
	preorder(n.right);
}
public static void inorder(Node n) {
	if (n == null) return;
	inorder(n.left);
	sb.append(n.value);
	inorder(n.right);
}
public static void postorder(Node n) {
	if (n == null) return;
	postorder(n.left);
	postorder(n.right);
	sb.append(n.value);
}
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st ;
	int N = Integer.parseInt(br.readLine());
	tree = new Node[N+1];
	for (int i = 0; i < N; i++) {
		st = new StringTokenizer(br.readLine());
		char p = st.nextToken().charAt(0);
		char l = st.nextToken().charAt(0);
		char r = st.nextToken().charAt(0);
		if (tree[p - 'A'] == null) {
			tree[p - 'A'] = new Node(p);
		}
		if (l != '.') {
			tree[l -'A'] = new Node(l);
			tree[p-'A'].left = tree[l -'A'];
		}
		if (r != '.') {
			tree[r -'A'] = new Node(r);
			tree[p-'A'].right = tree[r -'A'];
		}
	}
	
	preorder(tree[0]);
	sb.append("\n");
	inorder(tree[0]);
	sb.append("\n");
	postorder(tree[0]);
	System.out.println(sb);
}
}

package trees;
import java.util.*;
class Node {
	int key;
	Node left;
	Node right;
	Node(int k) {
		key = k;
	}
}

public class Treeoperations {
	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.key+" ");
		inorder(root.right);
	}
	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void postorder(Node root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key+" ");
	}
	public static void levelorder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (q.size() > 0) {
			Node curr = q.poll();
			if (curr != null) {
				System.out.print(curr.key+" ");
			}
			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}
		}
		
	}
	public static void levelorderline(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (q.size() > 1) {
			Node curr = q.poll();
			if (curr == null) {
				q.add(null);
				System.out.println();
				continue;
			}
			System.out.print(curr.key + " ");
			if (curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
		}
		
	}
	public static int size(Node root) {
		if (root == null) {
			return 0;
		}
		else {
			return 1 + size(root.left) + size(root.right);
		}
	}
	public static int maximum(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		else {
			return Math.max(root.key,Math.max(maximum(root.left),maximum(root.right)));
		}
	}
	public static int height(Node root) {
		if (root == null) {
			return 0;
		}
		else {
			return Math.max(height(root.left),height(root.right)) + 1;
		}
	}
	public static void leftview(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		int i = 0;
		while (q.size() > 1) {
			Node curr = q.poll();

			if (curr == null) {
				q.add(null);
                i = 0;
				continue;
			}
			if (i == 0)
				System.out.print(curr.key + " ");
			i = 1;
			if (curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(7);
		root.left.left = new Node(8);
        System.out.println("inorder travsersal:");
        inorder(root);
        System.out.println();
        System.out.println("preorder traversal:");
        preorder(root);
        System.out.println();
        System.out.println("postorder traversal:");
        postorder(root);
        System.out.println();
        System.out.println("level order travsersal");
        levelorder(root);
        System.out.println();
        System.out.println("level order traversal by line by line");
        levelorderline(root);
        System.out.println();
        System.out.println("size of binary tree :");
        System.out.println(size(root));
        System.out.println("the maximu of binary tree");
        System.out.println(maximum(root));
        System.out.println("height of binary tree:");
        System.out.println(height(root));
        System.out.println("left view of binary tree:");
        leftview(root);

	}

}

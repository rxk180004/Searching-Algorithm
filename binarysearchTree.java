package Sorting;

public class binarysearchTree {
	class Node{
		int key;
		Node right;
		Node left;
		
		 Node(int item) {
			key=item;
			right=left=null;
		}
	}
	Node root=null;
	public void insert(int key) {
		root=insertRec(root,key);
	}
	
	public Node insertRec(Node root,int key) {
		if(root ==null) {
			root =new Node(key);
			return root;
		}
		if(key<root.key) {
			root.left=insertRec(root.left,key);
		}
		else if (key>root.key) {
			root.right=insertRec(root.right,key);
		}
		return root;
	}
	
	void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
	}
	
	void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.key+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key+" ");
		}
	}
	
	int findElement(Node root,int p) {
		if(root==null) {
			return -1;
		}
		else if(root.key==p) {
			System.out.println("matched");
			return 1;
		}
		else if (root.key<p) {
			System.out.println("matched right");
		    return findElement(root.right,p);
			
		}
		else if(root.key>p) {
			return findElement(root.left,p);
		}
		return -1;
	}
	

	public static void main(String[] args) {
		binarysearchTree bst=new binarysearchTree();
		bst.insert(21);
		bst.insert(28);
		bst.insert(18);
		bst.insert(19);
		bst.insert(23);
		bst.insert(32);
		bst.insert(22);
		
		bst.inorder(bst.root);
		System.out.println();
		bst.preOrder(bst.root);
		System.out.println();
		bst.postOrder(bst.root);
		System.out.println();
		
		int result=bst.findElement(bst.root,23);
		System.out.println("result is"+result);
		if(result==1) {
			System.out.println("Element found");
		}
		else 
		{
			System.out.println("Element not found");
		}
		}
}


package misc2;

import java.util.ArrayList;
import java.util.HashMap;

public class Tree {

	private Node root;

	public Node getRoot(){
		return root;
	}
	
	public void insert(int d){
		Node n = new Node(d);
		Node current = new Node();
		Node parent = new Node();
		System.out.println("Adding " + d);
		if(root == null){
			root = n;
			System.out.println("Root Empty: Creating - " + d);
		}else{
			parent = root;
			current = root;
			while(true){
				if(d < current.data){
					System.out.println("Data less than " + current.data);
					parent = current;
					current = current.left;
					if(current == null){
						System.out.println("Inserting in left node of " + parent.data);
						parent.left = n;
						return;
					}
				}else if(d > current.data){
					System.out.println("Data greater than " + current.data);
					parent = current;
					current = current.right;
					if(current == null){
						System.out.println("Inserting in right node of " + parent.data);
						parent.right = n;
						return;
					}
				}
			}
		}	
	}
	
	public void printInorder(Node r){
		if(r != null){
			printInorder(r.left);
			System.out.print(r.data + " ");
			printInorder(r.right);
		}
	}
	
	public void printPreOrder(Node r){
		if(r != null){
			System.out.print(r.data + " ");
			printPreOrder(r.left);
			printPreOrder(r.right);
		}
	}
	
	public void printPostOrder(Node r){
		if(r != null){
			printPostOrder(r.left);
			printPostOrder(r.right);
			System.out.print(r.data + " ");
		}
	}
	
	public Node search(int d){
		if(root == null){
			return null;
		} else {
			Node temp = root;
			while(temp.data != d){
				if(d < temp.data){
					temp = temp.left;
				}else if (d > temp.data) {
					temp = temp.right;
				}
				if(temp == null){
					return null;
				}
			}
			return temp;
		}
	}
	
	public Node minNode(){
		Node temp = root;
		while(temp.left != null){
				temp = temp.left;
			}
			return temp;
	}
	
	public Node maxNode(){
		Node temp = root;
		while(temp.right != null){
				temp = temp.right;
			}
			return temp;
	}
	
	public void delete(int d){
		
		// Only for leaf node
		Node parent = root;
		Node current = root;
		boolean isLeft = false;
		
		while(current.data != d){
			if(d < current.data){
				parent = current;
				current = current.left;
				isLeft = true;
			}else if(d > current.data){
				parent = current;
				current = current.right;
				isLeft = false;
			}
		}
		
		if(current.left == null && current.right == null){
			parent.left = null;
			parent.right = null;
		}else if(current.left != null && current.right == null){
			if(isLeft){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}else if(current.left == null && current.right != null){
			if(isLeft){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left != null && current.right != null){
			Node s = getSuccessor(current);
			Node p = getParent(current);
			if(s.right == null){
				
			}
			
		}
	}
	
	private Node getParent(Node n){
		if(n == root){
			return null;
		}else{
			Node parent = root;
			Node current = new Node();
			while(current.data != n.data){
				if(n.data < root.data){
					parent = current;
					current = current.left;
				}else{
					parent = current;
					current = current.right;
				}
			}	
			return parent;
		}
	}
	
	public Node getSuccessor(Node n){
		
		//Node successor = new Node();
		Node current = n.right;
		
		if(current.right == null){
			return current;
		}else{
			while(current.left != null){
				current = current.left;
			}
			return current;
		}
	}
	
	public Node getPredeccessor(Node n){
		return null;
	}
	
	
	
	public int getHeight(Node n){
		int hl = -1, hr = -1;
		if(n == null){
			return -1;
		}else{
			hl = getHeight(n.left);
			hr = getHeight(n.right);
			return Math.max(hl+1, hr+1);
		}
	}
	
	public boolean isBalanced(Node n){
		
		if(n == null){
			return false;
		}else{
			int hl, hr;
			hl = getHeight(n.left);
			hr = getHeight(n.right);
			if(Math.abs(hl-hr)<=1){
				return true;
			}else{
				return false;
			}
		}
	}
	
	public HashMap<Integer, ArrayList<Node>> deptWise(Node root){
		
		HashMap<Integer, ArrayList<Node>> map = new HashMap<Integer, ArrayList<Node>>();
		ArrayList<Node> tempList = new ArrayList<Node>();
		tempList.add(root);
		map.put(0, tempList);
		Integer currentLevel = 0;
		
		while(true){
			tempList.clear();
			System.out.println("DEBUG: Running for level - " + currentLevel);
			for(int i=0; i<map.get(currentLevel).size(); i++){
				Node tempn = map.get(currentLevel).get(i);
				System.out.println("DEBUG: Running for node - " + map.get(currentLevel).get(i));
				tempList.add(tempn.left);
				tempList.add(tempn.right);
			}
			if(tempList.isEmpty()){
				break;
			}else{
				currentLevel++;
				map.put(currentLevel, tempList);
			}
		}	
		return map;
	}
	
}














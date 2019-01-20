package misc2;

import java.util.ArrayList;
import java.util.HashMap;

public class MainApp {

	public static void main(String[] args) {
		
		//graphCheck();
		treeCheck();
		
	}
	
	public static void graphCheck(){
		Graph g = new Graph();
		
		System.out.println();
		System.out.println("** ADD VERTICES **");
		g.addVertex('A');	
		g.addVertex('B');	
		g.addVertex('C');	
		g.addVertex('D');	
		g.addVertex('E');	
		g.addVertex('F');	
		g.addVertex('G');	
		g.addVertex('H');	
		g.addVertex('I');	
		
		//g.displayVertexList();
		System.out.println();
		System.out.println("** ADD EDGES **");
		g.addEdge(new Vertex('A'),new Vertex('B'));
		g.addEdge(new Vertex('B'),new Vertex('F'));
		g.addEdge(new Vertex('F'),new Vertex('H'));
		g.addEdge(new Vertex('A'),new Vertex('C'));
		g.addEdge(new Vertex('A'),new Vertex('D'));
		g.addEdge(new Vertex('D'),new Vertex('G'));
		g.addEdge(new Vertex('G'),new Vertex('I'));
		g.addEdge(new Vertex('A'),new Vertex('E'));
		
		
		/*g.addEdge('B','F');
		g.addEdge('F','H');            
		g.addEdge('A','C');            
		g.addEdge('A','D');
		g.addEdge('D','G');
		g.addEdge('G','I');            
		g.addEdge('A','E');*/
		
		System.out.println();
		System.out.println("** ADJACENCY MATRIX **");
		g.displayAdjMatrix();
		System.out.println();
		
		System.out.println("** ADJACENCY LIST **");
		g.displayAdjList();
		
		System.out.println("** DEPT FIRST SEARCH **");
		g.dfsR(g.getVertexList()[0]);
	}

	public static void treeCheck(){
		
		Tree t = new Tree();
		
		System.out.println();
		System.out.println("** INSERTION **");
		t.insert(63);
		t.insert(27);
		t.insert(80);
		t.insert(13);
		t.insert(51);
		
		t.insert(70);
		t.insert(92);
		t.insert(26);
		t.insert(33);
		t.insert(58);
		
		t.insert(82);
		t.insert(57);
		t.insert(60);
		
		System.out.println();
		System.out.println("** TRAVERSAL **");
		System.out.println("Inorder: ");
		t.printInorder(t.getRoot());
		System.out.println();
		
		System.out.println("Preorder: ");
		t.printPreOrder(t.getRoot());
		System.out.println();
		
		System.out.println("Postorder: ");
		t.printPostOrder(t.getRoot());
		System.out.println();
		
		System.out.println();
		System.out.println("** SEARCHING **");
		int temp_data = 63;
		System.out.println("Searching 63 - " + t.search(temp_data).data);
		temp_data = 62;
		System.out.println("Searching - " + temp_data + ": " + ((t.search(temp_data) == null)?"Not Found":t.search(62).data));
		
		System.out.println();
		System.out.println("** FINDING MIN MAX **");
		System.out.println("Minimum: " + t.minNode().data);
		System.out.println("Maximum: " + t.maxNode().data);
		
		System.out.println();
		System.out.println("** FINDING SUCCESSOR PREDECCESSOR **");
		temp_data = 58;
		Node n = new Node();
		n = t.search(temp_data);
		System.out.println("Successor of " + temp_data + ": " + 
				((t.getSuccessor(n) == null)?"Not Present":t.getSuccessor(n).data));
		
		System.out.println();
		System.out.println("** IS TREE BALANCED **");
		Node n2 = t.search(63);
		if(t.isBalanced(n2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		System.out.println();
		System.out.println("** LEVEL PRINT **");
		n2 = t.search(63);
		HashMap<Integer, ArrayList<Node>> rslt = new HashMap<Integer, ArrayList<Node>>();
		rslt = t.deptWise(n2);
		for(Integer level: rslt.keySet()){
			System.out.print(level + ": ");
			for(Node c: rslt.get(level)){
				System.out.print(c.data + " ");
			}
			System.out.println();
		}
		
	}
	
}

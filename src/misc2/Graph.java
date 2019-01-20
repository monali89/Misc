package misc2;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

	private int VERTEX_SIZE = 9;
	private Vertex[] vertexList;
	private int adjMat[][];
	private int vertextCtr = 0;
	private HashMap<Vertex, ArrayList<Vertex>> adjList;
	private boolean isDirected;
	
	Graph(){
		// Create array of type vertex
		vertexList = new Vertex[VERTEX_SIZE];
		adjMat = new int[VERTEX_SIZE][VERTEX_SIZE];
		adjList = new HashMap<Vertex, ArrayList<Vertex>>();
		isDirected = false;
		
		// Similarly initialize all adjMat (u,v) to 0 as none of the edges are defined
		for(int i=0; i<VERTEX_SIZE; i++){
			for(int j=0; j<VERTEX_SIZE; j++){
				adjMat[i][j] = 0;
			}
		}	
	}
	
	public void addVertex(char c){
		if(vertextCtr < VERTEX_SIZE){
			Vertex v = new Vertex(c);
			vertexList[vertextCtr++] = v;
			adjList.put(v, new ArrayList<Vertex>());
			//adjList.put(v, null);
		}
	}
	
	public void addEdge(Vertex v1, Vertex v2){
		int start = -1, end = -1;
		
		// Find their i and j indices
		for(int i=0; i<VERTEX_SIZE; i++){
			System.out.println(vertexList[i].data);
			if(vertexList[i].data == v1.data){
				start = i;
			}
			if(vertexList[i].data == v2.data){
				end = i;
			}
		}
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
		
		ArrayList<Vertex> currentList = new ArrayList<Vertex>();
		
		if(adjList.get(v1) != null){
			currentList = adjList.get(v1);
			currentList.add(v2);
			adjList.put(v1, currentList);
		}else{
			adjList.put(v1, new ArrayList<Vertex>());
			currentList = adjList.get(v1);
			currentList.add(v2);
			adjList.put(v1, currentList);
		}
		
		if(!this.isDirected){
			if(adjList.get(v2) != null){
				currentList = adjList.get(v2);
				currentList.add(v1);
				adjList.put(v2, currentList);
			}else{
				adjList.put(v2, new ArrayList<Vertex>());
				currentList = adjList.get(v2);
				currentList.add(v1);
				adjList.put(v2, currentList);
			}
		}
	}
	
	public void displayVertexList(){
		for(int i=0; i<VERTEX_SIZE; i++){
			System.out.println(vertexList[i].data);
		}
	}
	
	public Vertex[] getVertexList(){
		return vertexList;
	}
	
	public void displayAdjMatrix(){
		System.out.print("  ");
		for(int i=0; i<VERTEX_SIZE; i++){
			System.out.print(vertexList[i].data + " ");
		}
		System.out.println();
		for(int i=0; i<VERTEX_SIZE; i++){
			System.out.print(vertexList[i].data + " ");
			for(int j=0; j<VERTEX_SIZE; j++){
				System.out.print(adjMat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void displayAdjList(){
		for(Vertex v: adjList.keySet()){
			System.out.print(v.data + ": ");
			for(Vertex n: adjList.get(v)){
				System.out.print(n.data + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void markVisited(char c){
		
	}
	
	public void adjList(){
		
	}
	
	public void dfsNR(Vertex u){
		Stack s = new Stack();
		s.push(u.data);
	}
	
	public void dfsR(Vertex u){
		if(u != null){
			System.out.println(u.data);
			u.wasVisited = true;
			for(Vertex n: this.adjList.get(u)){
				dfsR(n);
				n.wasVisited = true;
			}
			
			for(int i=0; i<VERTEX_SIZE; i++){
				
			}
		}
	}
	
	public void bfsNR(Vertex v){
		Queque q = new Queque();
		Vertex c = v;
		System.out.print(v.data + " ");
		v.wasVisited = true;
		
		while(!q.isEmpty()){
			//c = q.dqueque();
			for(int i=0; i<VERTEX_SIZE; i++){
				for(int j=0; j<VERTEX_SIZE; j++){
					if( (i != j) && (adjMat[i][j] == 1)){
						System.out.print(vertexList[j].data + " ");
						
					}
				}
			}
		}
		
		
		
	}
}

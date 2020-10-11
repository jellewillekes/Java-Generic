/*******************************************************************************
  * File: Graph.java
  * Author: Andre Berger  
  *
  * Class to represent graphs using adjacency matrix and adjacency lists
  ******************************************************************************/

import java.util.*;
import java.io.*;

public class Graph{
  
  private int numberOfNodes;         
  private int numberOfEdges;
  private boolean[][] adjacent;
  private ArrayList<ArrayList<Integer>> adjacencyLists;
  
  // Constructor for a graph, information is read from file
  // adjacency matrix as well as adjacency list is filled
  
  public Graph(String filename) 
    throws java.io.FileNotFoundException{
    File file = new File(filename);
    Scanner input = new Scanner (file);
    
    this.numberOfNodes = input.nextInt();
    this.numberOfEdges = input.nextInt();
    
    this.adjacent = new boolean[this.numberOfNodes][this.numberOfNodes];
    
    this.adjacencyLists = new ArrayList<ArrayList<Integer>>();
    for (int i=0;i<this.numberOfNodes;i++){
     this.adjacencyLists.add(new ArrayList<Integer>());
    }
    
    for (int i=0;i<this.numberOfEdges;i++){
      int u = input.nextInt();
      int v = input.nextInt();
      
      this.adjacent[u][v] = true;
      this.adjacent[v][u] = true;
            
      this.adjacencyLists.get(u).add(v);
      this.adjacencyLists.get(v).add(u);
    }   
    input.close();
  
  }
  
  // returns the number of nodes of this graph
  public int getNumberOfNodes(){
    return this.numberOfNodes; 
  }
  
  // returns the number of edges of this graph
  public int getNumberOfEdges(){
    return this.numberOfEdges; 
  }
  
  // returns whether node i and node j are adjacent in this graph
  public boolean isAdjacent(int i, int j){
    return this.adjacent[i][j]; 
  }

  public int degree(int i){
   
    return this.adjacencyLists.get(i).size();
  }
  
  // returns true if and only if this graph is connected (using a stack)
  public boolean isConnectedStack(){ // 0 = unreached ; 1 = reached
    int[] node = new int[this.numberOfNodes];
    int connectedNode = 0;
    
    for(int i = 0; i<this.numberOfNodes ; i++){
     node[i] = 0; 
    }
    
    IntegerStack connected =  new IntegerStack();
    connected.push((int)Math.random()*this.numberOfNodes);
    
    while(connected.isEmpty()==false){
      connectedNode = connected.pop();
      node[connectedNode] = 1;
      
        for(int i=0;i<this.numberOfNodes;i++){
        if (this.adjacent[connectedNode][i] && node[i]==0){
          connected.push(i);
        }
        }
    }
    
    for(int i=0; i<this.numberOfNodes;i++){
      if (node[i]==0){
        return false;
      }
    }
    return true;
  }


// returns true if and only if this graph is connected (using a queue)
  public boolean isConnectedQueue(){ // 0 = unreached ; 1 = reached
    int[] node2 = new int[this.numberOfNodes];
    int connectedNode2 = 0;
    
    for(int i = 0; i<this.numberOfNodes ; i++){
     node2[i] = 0;
    }
    
    Queue<Integer> connected2 = new Queue<Integer>();
    connected2.enqueue((int)Math.random()*this.numberOfNodes);
    
    while(connected2.isEmpty()==false){
      connectedNode2 = connected2.dequeue();
      node2[connectedNode2] = 1;
      
  for(int i=0;i<this.numberOfNodes;i++){
        if (this.adjacent[connectedNode2][i] && node2[i]==0){
          connected2.enqueue(i);
        }
        }
    }
    
    for(int i=0; i<this.numberOfNodes;i++){
      if (node2[i]==0){
        return false;
      }
    }
    return true;
  }
  

  public static void main(String[] args){
    try{
      
      Graph graph = new Graph(args[0]); 
      
      for (int i=0; i < graph.getNumberOfNodes(); i++){
        for (int j=0; j < graph.getNumberOfNodes(); j++){
          System.out.print(graph.isAdjacent(i,j) + " ");
        }
        System.out.println();
      }
      
      
      for (int i=0; i < graph.getNumberOfNodes(); i++){
        System.out.println("degree of node " + i + ": " + graph.degree(i));
      }
      if (graph.isConnectedStack()){
        System.out.println("the graph is connected");
      }
      else {
        System.out.println("the graph is not connected");
      }
       if (graph.isConnectedQueue()){
        System.out.println("the graph is connected");
      }
      else {
        System.out.println("the graph is not connected");
      }
      
    } // end of main method
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
  }
  
  
}
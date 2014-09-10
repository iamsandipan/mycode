package com.interview.algorithms;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.interview.algorithms.models.GraphNode;

public class GraphSearch {
		
		public static void main(String [] args){
			GraphSearch graph = new GraphSearch();
			GraphNode rootNode =  graph.createArbitraryGraph();
			bfsSearch(graph, rootNode);
			rootNode =  graph.createArbitraryGraph();
			System.out.println("DFS----");
			dfsSearch(graph, rootNode);
		}

		private static void bfsSearch(GraphSearch graph, GraphNode rootNode) {
			Deque<GraphNode> trackQueue = new LinkedList<GraphNode>();

			rootNode.setVisited(true);
			trackQueue.addFirst(rootNode);
			graph.printNode(rootNode);

			while(!trackQueue.isEmpty()){
				GraphNode node = trackQueue.removeLast();
				for(GraphNode child : node.getUnvisitedNextNodes()) {
					child.setVisited(true);
					graph.printNode(child);
					trackQueue.addFirst(child);
				}
			}
		}
				
		private static void dfsSearch(GraphSearch graph, GraphNode rootNode) {
			Stack<GraphNode> trackQueue = new Stack<GraphNode>();

			rootNode.setVisited(true);
			graph.printNode(rootNode);
			trackQueue.push(rootNode);
			while(!trackQueue.isEmpty()){
				GraphNode node = trackQueue.peek();
				GraphNode child = node.getUnvisitedOneNextNode();
				if(child != null){
					child.setVisited(true);
					graph.printNode(child);
					trackQueue.push(child);
				}else{
					trackQueue.pop();
				}
				
			}
		}

	
		public void printNode(GraphNode node){
			System.out.print(node.getName() + ", ");
		}

		public GraphNode createArbitraryGraph(){
			GraphNode node1 = new GraphNode("A1");
			GraphNode node2 = new GraphNode("A2");
			GraphNode node3 = new GraphNode("A3");
			GraphNode node4 = new GraphNode("A4");
			GraphNode node5 = new GraphNode("A5");
			GraphNode node6 = new GraphNode("A6");
			GraphNode node7 = new GraphNode("A7");
			node1.addNode(node2);
			node1.addNode(node3);
			node2.addNode(node4);
			node2.addNode(node5);
			node3.addNode(node6);
			node3.addNode(node7);
			return node1;
		}
	
	
}

package com.interview.algorithms;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import com.interview.algorithms.models.GraphNode;

public class DFSGraphSearch {
		private static Deque<GraphNode> trackQueue = new LinkedList<GraphNode>();
		public static void main(String [] args){
			DFSGraphSearch graph = new DFSGraphSearch();
			GraphNode rootNode =  graph.createArbitraryGraph();
			rootNode.setVisited(true);
			trackQueue.addFirst(rootNode);
			while(!trackQueue.isEmpty()){
				GraphNode node = trackQueue.remove();
				for(GraphNode child : node.getUnvisitedNextNodes()) {
					child.setVisited(true);
					graph.printNode(child);
					trackQueue.add(child);
				}
			}
			
			
		}
	
		public void printNode(GraphNode node){
			
			System.out.print(node.getName() + ", ");
		}
		public GraphNode createArbitraryGraph(){
			GraphNode node1 = new GraphNode("A0-0");
			GraphNode node2 = new GraphNode("A3-2");
			GraphNode node3 = new GraphNode("A1-1");
			GraphNode node4 = new GraphNode("A2-1");
			node1.addNode(node4);
			node1.addNode(node3);
			node4.addNode(node2);
			GraphNode node5 = new GraphNode("E");
			node4.addNode(node5);


			
			return node1;
		}
	
	
}

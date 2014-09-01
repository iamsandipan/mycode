package com.interview.algorithms.models;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	private String name;
	public GraphNode(String name){
		this.name = name;
	}
	private boolean visited;
	
	private List<GraphNode> nextNodes = new ArrayList<GraphNode>();

	public void addNode(GraphNode node){
		if(node != null){
			nextNodes.add(node);
		}
	}
	
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public List<GraphNode> getNextNodes() {
		return nextNodes;
	}
	
	public List<GraphNode> getUnvisitedNextNodes() {
		List<GraphNode> unvisiteNodes = new ArrayList<GraphNode>();
		for(GraphNode graphNode : nextNodes){
			if(!graphNode.isVisited()){
				unvisiteNodes.add(graphNode);
			}
		}
		return unvisiteNodes;
	}


	public String getName() {
		return name;
	}

	
}

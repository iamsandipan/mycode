package com.interview.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	private NodeLRU prevNode;
	private NodeLRU nextNode;
	private static int size;
	private static int MAX_SIZE= 100000;
	private static NodeLRU headNode;
	private Map<Integer, NodeLRU> index = new HashMap<Integer , NodeLRU>();
	
	
	
	
	private LRUCache(){
		headNode = new NodeLRU(null);
		prevNode = headNode;
	}
	
	public NodeLRU getPreviousNode(){
		return prevNode;
	}
	
/*	public NodeLRU findDocument(NodeLRU node, int hashCode){
		NodeLRU node = index.get(hashCode);
		NodeLRU nextNode = node.getNextNode();
		if(nextNode != null){
			int hash = nextNode.getDocument().hashCode();
			if(hashCode == hash){
				return nextNode;
			}else{
				findDocument(nextNode, hashCode);
			}
		}
		return null;
	}

	public NodeLRU findDocument(NodeLRU node, int hashCode){
		NodeLRU nextNode = node.getNextNode();
		if(nextNode != null){
			int hash = nextNode.getDocument().hashCode();
			if(hashCode == hash){
				return nextNode;
			}else{
				findDocument(nextNode, hashCode);
			}
		}
		return null;
	}
*/	
	public void addToCache(NodeLRU node){
		node.setNextNode(node);
		prevNode.setPrevNode(node);
		size++;
		index.put(node.getDocument().hashCode(), node);
	}

	public NodeLRU getNextNode() {
		return nextNode;
	}

	public void setNextNode(NodeLRU nextNode) {
		this.nextNode = nextNode;
	}

	public NodeLRU getHeadNode() {
		return LRUCache.headNode;
	}

	public void setHeadNode(NodeLRU headNode) {
		LRUCache.headNode = headNode;
	}
	
}


class NodeLRU{
	private String document;
	private NodeLRU nextNode;
	private NodeLRU prevNode;
	public NodeLRU(String str){
		this.document = str;
	}
	public NodeLRU getNextNode() {
		return nextNode;
	}
	public void setNextNode(NodeLRU nextNode) {
		this.nextNode = nextNode;
	}
	public NodeLRU getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(NodeLRU prevNode) {
		this.prevNode = prevNode;
	}
	public String getDocument() {
		return document;
	}
	
}
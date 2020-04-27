package org.insa.graphs.algorithm.utils;

import org.insa.graphs.model.Arc;
import org.insa.graphs.model.Node;

public class Label implements Comparable<Label>{
	private Node currentNode;
	private boolean mark;
	private double cost;
	private Arc Father;
	
	public Label() {
		this.currentNode = null;
		this.mark = false;
		this.cost = Double.POSITIVE_INFINITY;
		this.Father = null;	
	}
	
	public Label(Node node) {
		this.currentNode = node;
		this.mark = false;
		this.cost = Double.POSITIVE_INFINITY;
		this.Father = null;		
	}

	public Node getCurrentNode() {
		return this.currentNode;
	}

	public void setCurrentNode(Node node) {
		this.currentNode = node;
	}

	public boolean getMark() {
		return this.mark;
	}

	public void setMark() {
		this.mark = true;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Arc getFather() {
		return this.Father;
	}

	public void setFather(Arc a) {
		this.Father = a;
	}
	
	public double getTotalCost() {
		return this.cost;
	}
	
	@Override
    public int compareTo(Label o) {
        return Double.compare(this.getCost(), o.getCost());
    }
	
}

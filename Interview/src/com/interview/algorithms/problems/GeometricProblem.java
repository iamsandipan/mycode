package com.interview.algorithms.problems;

import com.interview.algorithms.models.Rectangle;

public class GeometricProblem {

	//Given two rectangles, find if the given two rectangles overlap or not.
	
	public double getCommonArea(Rectangle r1, Rectangle r2){
	
		double length = 0;
		double br = 0;
		if( (r1.getTop() > r2.getTop() && r2.getBottom() > r1.getBottom())){
			length = r2.getTop() - r2.getBottom();
		}else if( (r1.getTop() > r2.getTop() && r2.getBottom() < r1.getBottom())){
			length = r2.getTop() - r1.getBottom();
		}else if( (r1.getTop() < r2.getTop() && r2.getBottom() < r1.getBottom())){
			length = r2.getTop() - r1.getBottom();
		}
		
		 	
		return length*br;
		
	}
	
}

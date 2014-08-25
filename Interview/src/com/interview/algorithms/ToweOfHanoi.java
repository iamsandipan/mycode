package com.interview.algorithms;

import java.util.ArrayList;
import java.util.List;

/*	  Move(N, Src, Aux, Dst)  //Move N items from Src to dest using Aux
		if N is 0 
	  exit
		else
	  		Solve(N - 1, Src, Dst, Aux)  //Move N-1 items from Src to Aux using dest
	  		Move from Src to Dst         //Move 1 item from src to Dst
	  		Solve(N - 1, Aux, Src, Dst)  //Move N-1 item from Aux to Src
	  		
	  		Time COmplexity Tn = 2Tn-1 + 1
	  		                T1 = 1
	  		                T2 = 2 . 1 + 1
	  		                T3 = 2 . 
*/

	final class Move {

    private final String source;
    private final String destination;

    public Move (String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}

public final class ToweOfHanoi {
	
	
    private ToweOfHanoi () { }

    /**
     * Solves the problem of tower of hanoi 
     * 
     * @param n     number of plates
     * @return      The Set of sequential steps or moves to take to solve the hanoi problem.
     */
    public static List<Move> solve(int n) {
        if (n <= 0) throw new IllegalArgumentException("The number of plates " + n  + " should be greater than zero.");

        final List<Move> platePair = new ArrayList<Move>();
        moveTowers(n, "A", "B", "C", platePair);
        return platePair;
    }

    public static void moveTowers(int n, String from, String using, String to, List<Move> platePair) {
        assert platePair != null;
        if (n == 0) return;
        moveTowers(n - 1, from, to, using, platePair);  //
        platePair.add(new Move(from, to));
        moveTowers(n - 1, using, from, to, platePair);
    }

    public static void main(String[] args) {
        for (Move getHanoi :  solve(2)) {
            System.out.println(getHanoi.getSource() + " : " + getHanoi.getDestination());
        }
    }
}



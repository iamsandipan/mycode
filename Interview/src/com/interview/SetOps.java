package com.interview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SetOps {

	
	private static final int BASE = 2;


	public static void main(String [] args){
		
		Set <Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		
		Set <Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(3);

		System.out.println(set1);
		set1.retainAll(set2);
		System.out.println(set1);
		SetOps dtb = new SetOps();
	    dtb.printBinaryFormat(2.333);	
	    //dtb.fibonacci();	
	}
	
	
	public void printBinaryFormat(double number){
        String numberString = String.valueOf(number);
		int indexPoint = numberString.indexOf(".");
        
		String decimal = numberString.substring(0, indexPoint);
		String fraction = numberString.substring(indexPoint);
		
		double fractionPart = Double.valueOf(fraction);
		
		
		long decimalPart = Long.valueOf(decimal);
		LinkedList<String> binary = new LinkedList<String>();
        convertDecimal(decimalPart, binary);
        
        binary.addLast("." ) ;
        
        convertFraction(fractionPart, binary);
        System.out.print(binary);
    }


	private void convertFraction(double fractionPart,
			LinkedList<String> binary) {
		while(fractionPart > 0){
            fractionPart = fractionPart*2;
            if(fractionPart >= 1){
            	binary.addLast("" + 1) ;
            	fractionPart = fractionPart -1;
            }else{
            	binary.addLast("" + 0) ;
            }
        }
	}


	private void convertDecimal(long decimalPart, LinkedList<String> binary) {
		while(decimalPart > 0){
            binary.addFirst(""+ decimalPart%BASE);
            decimalPart = decimalPart/2;
        }
	}
	
	
	
	public void fibonacci(){
		long tn = 1;
		long tn_1 = 1;
		int count = 1;
		System.out.println("Fibonacci start");
		System.out.print("" + tn + "," + tn_1);
		fibonacci(tn, tn_1, count);
		
	}


	private void fibonacci(long tn, long tn_1, int count) {
		if(count >= 50){
			return;
		}
		long tn_2 = tn + tn_1;
		System.out.print(", " + tn_2);
		count ++;
		fibonacci(tn_2, tn, count );
	}
     
   
}

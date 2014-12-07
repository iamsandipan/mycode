package com.interview;

import java.util.LinkedList;

public class ConvertStringToBinary {
	private static final int BASE = 2;
	
	public static void main(String[] args){
		ConvertStringToBinary binary = new ConvertStringToBinary();
		binary.printBinaryFormat(10.625);
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
	

}

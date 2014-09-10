package com.interview.algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicatesInString<T> {

	public static void main(String [] args){
		RemoveDuplicatesInString <Character> helo = new RemoveDuplicatesInString <Character>();
		Character ch = 'c';
		
		helo.reverseString("H  elo");
	}
	
	public String reverseString(String  str){
		if(str == null){
			return null;
		}
		char [] str1 = str.toCharArray();
		int j = str1.length -1;
		for(int i = 0 ; i < j ; i ++){
			swap(i, j, str1);
			j--;
		}
		
		System.out.println(str1);
		return str;
		//StringBuilder strbuf = new StringBuilder();
		//for(char ch : str.toCharArray());
		
	}
	
	private void swap(int i , int j , char [] array){
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private void replaceAllSpaceWith2D(String str){
		StringBuilder strB = new StringBuilder();
		for(char ch : str.toCharArray()){
			if(ch != ' '){
				strB.append(ch);
			}else{
				strB.append("%20D");
			}
		}
		System.out.println(strB.toString());
	}
	
	public boolean checkAnagrams(String str, String str1){
		Map<Character, Integer> charMap1 = new HashMap<Character, Integer>();
		Map<Character, Integer> charMap2 = new HashMap<Character, Integer>();

		populateCharMap(charMap1, str);
		populateCharMap(charMap2, str);
		
		if(charMap1.size() != charMap2.size()){
			return false;
		}

		for(Map.Entry<Character, Integer> map : charMap1.entrySet()){
			Character key = map.getKey();
			Integer value = map.getValue();
			Integer valueInMap2 = charMap2.get(key);
			if(valueInMap2 == null){
				return false;
			}
			if(value != valueInMap2 ){
				return false;
			}
		}
		return false;
	}
	
	
	private void populateCharMap(Map<Character, Integer> map, String str){
		
		for(int i = 0 ; i < str.length(); i ++ ){
			Character ch = str.charAt(i);
			Integer value = map.get(ch);
			if(value == null){
				map.put(ch, 1);
			}else{
				map.put(ch, value + 1);
			}
		}
		
		
	}
	
	public boolean isUniqueString(String s){
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(0);
			String subStr = s.substring(1);
			if(subStr.contains(""+ch)){
				return false;
			}
		}
		return true;
	}
	
	public T[] removeDuplicates(T [] array){
		if(array == null){
			return null;
		}
		List<T> arrrayList = Arrays.asList(array);
		List<T> newArrrayList = new ArrayList<T>();
		while(!arrrayList.isEmpty()){
			T element = arrrayList.remove(0);
			if(element != null && !arrrayList.contains(element)){
				newArrrayList.add(element);
			}
		}
		return (T[]) newArrrayList.toArray();
	}

	private boolean fillDuplicateByNull(T[] array, int index, int j) {
		if(checkDuplicateEntry(array, index, j)){
			array[j] = null;
			return true;
		}
		return false;
	}

	private boolean checkDuplicateEntry(T[] array, int index, int j) {
		return (array[j] != null) && (array[index].equals(array[j]));
	}
	
	
	
}

package com.interview.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {

	
	
	
	
	
	
}



class File{
	private int hashCode;
	private String name;
	private List<File> files = new ArrayList<File>();
	
	public File(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<File> getFiles() {
		return files;
	}
	
}
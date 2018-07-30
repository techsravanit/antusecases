package com.so.helper;

public class SearchArray {
	public int find(int[] in, int ele){
		int pos=-1;
		
		if(in.length!=0){
			for(int i=0; i<in.length; i++) {
				if(in[i] == ele){
					pos=i;
				}
			}
		}
		return pos;
	}
}

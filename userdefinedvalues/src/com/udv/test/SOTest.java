package com.udv.test;

import com.udv.helper.SearchArray;

public class SOTest {

	public static void main(String[] args) {
		SearchArray sa=new SearchArray();
		int position=sa.find(new int[]{10,2,16,34}, 1);
		System.out.println("position found: "+position);
	}

}

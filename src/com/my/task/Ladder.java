package com.my.task;

import java.util.ArrayList;

public class Ladder {

	public ArrayList<String> process(int total) {
		ArrayList<String> arr = new ArrayList<String>();
		
		int ladder = 0;
		
		if(total==1) {
			arr.add("#");
		}
		else {
			for(int i=0; i < total ; i++) {	
				   ladder+=1;
				   if(ladder==total) {
						arr.add(draw('#',ladder));
					}else {
						String fullLadder =draw(' ',total-ladder)+draw('#',ladder);
						arr.add(fullLadder);
					}
			   }
		}
	
		return arr;
	}
	
	public String draw(char sign, int count) {
		
		String result = new String();
		
		for(int i = 0;i< count; i++) {
			result+=sign;
		}
		
		return result;
	}
	
}

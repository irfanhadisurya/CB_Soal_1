package com.my.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		
		 int total;
	     InputStreamReader isr = new InputStreamReader(System.in);
	     BufferedReader br = new BufferedReader(isr);
	     
	     System.out.print("Input Number: ");
	     total = Integer.parseInt(br.readLine()) ;

	     Ladder ladder = new Ladder();
	     ArrayList<String> show = new ArrayList<String>();
	     show = ladder.process(total);
	     
	     for(int i=0; i< total; i++) {
	    	 System.out.println(show.get(i));
	     }

	}

}

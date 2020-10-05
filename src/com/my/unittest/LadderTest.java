package com.my.unittest;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import com.my.task.Ladder;

public class LadderTest {

	Ladder ladder;
	
	
	@Test
	void shouldDrawOneString() {
		ladder = new Ladder();
		
		String result = ladder.draw('#', 1);
		
		assertEquals(result,"#");
	}

	
	@Test
	void shouldDrawTwoLadder() {
		ladder = new Ladder();
		
		String result = ladder.draw('#', 2);
		
		assertEquals(result,"##");
	}
	
	@Test
	void shouldReturnOneArrayLadder() {
		ladder = new Ladder();
		
		ArrayList<String> result = ladder.process(1);
		
		assertEquals(result.size(),1);
		assertEquals(result.get(0),"#");
	}
	
	@Test
	void shouldReturnTwoLadder() {
		ladder = new Ladder();
		
		ArrayList<String> result = ladder.process(2);
		
		assertEquals(result.get(0),"##");
	}
	
	@Test
	void shouldReturnTwoDimensionLadder() {
		ladder = new Ladder();
		
		ArrayList<String> result = ladder.process(2);
		
		assertEquals(result.get(0)," #");
		assertEquals(result.get(1),"##");
	}
	
}

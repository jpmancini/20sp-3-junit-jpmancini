import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class TestSlipperySlot {
	SlipperySlot slot = new SlipperySlot();
	
	//test none
	@Test
	public void testRuleNone() {
		int[] nums = new int[] {3,5,6,7,10}; 
		
		assertEquals(slot.payOff(nums), 0, "failed testRuleNone()");
	}
	
	//test rule1
	@Test
	public void testRuleOne() {
		int[] nums = new int[] {3,3,3,3,3}; 
		
		assertEquals(slot.payOff(nums), 1000000, "failed testRuleOne()");
	}
	
	//test rule1&6
	@Test
	public void testRuleOneSix() {
		int[] nums = new int[] {9,9,9,9,9}; 
		
		assertEquals(slot.payOff(nums), 1000007, "failed testRuleOneSix()");
	}
	
	//test rule1&7
	@Test
	public void testRuleOneSeven() {
		int[] nums = new int[] {42,42,42,42,42}; 
		
		assertEquals(slot.payOff(nums), 1000002, "failed testRuleOneSeven()");
	}
	
	//test rule1&8
	@Test
	public void testRuleOneEight() {
		int[] nums = new int[] {2,2,2,2,2}; 
		
		assertEquals(slot.payOff(nums), 1000003, "failed testRuleOneEight()");
	}
	
	//test rule1&6&8
	@Test
	public void testRuleOneSixEight() {
		int[] nums = new int[] {4,4,4,4,4}; 
		
		assertEquals(slot.payOff(nums), 1000010, "failed testRuleOneSixEight()");
	}
	
	//test rule2
	@Test
	public void testRuleTwo() {
		int[] nums = new int[] {3,3,3,3,5}; 
		
		assertEquals(slot.payOff(nums), 10000, "failed testRuleTwo()");
	}
	
	//test rule2&6
	@Test
	public void testRuleTwoSix() {
		int[] nums = new int[] {3,3,3,3,9}; 
		
		assertEquals(slot.payOff(nums), 10007, "failed testRuleTwoSix()");
	}
	
	//test rule2&7
	@Test
	public void testRuleTwoSeven() {
		int[] nums = new int[] {3,3,3,3,42}; 
		
		assertEquals(slot.payOff(nums), 10002, "failed testRuleTwoSeven()");
	}
	
	//test rule2&8
	@Test
	public void testRuleTwoEight() {
		int[] nums = new int[] {3,3,3,3,2}; 
		
		assertEquals(slot.payOff(nums), 10003, "failed testRuleTwoEight()");
	}
	
	//test rule2&6&7
	@Test
	public void testRuleTwoSixSeven() {
		int[] nums = new int[] {9,9,9,9,42}; 
		
		assertEquals(slot.payOff(nums), 10009, "failed testRuleTwoSixSeven()");
	}
	
	//test rule2&6&8
	@Test
	public void testRuleTwoSixEight() {
		int[] nums = new int[] {9,9,9,9,2}; 
		
		assertEquals(slot.payOff(nums), 10010, "failed testRuleTwoSixEight()");
	}
	
	//test rule2&7&8
	@Test
	public void testRuleTwoSevenEight() {
		int[] nums = new int[] {42,42,42,42,2}; 
		
		assertEquals(slot.payOff(nums), 10005, "failed testRuleTwoSevenEight()");
	}
	
	//test rule2&6&7&8
	@Test
	public void testRuleTwoSixSevenEight() {
		int[] nums = new int[] {4,4,4,4,42}; 
		
		assertEquals(slot.payOff(nums), 10012, "failed testRuleTwoSixSevenEight()");
	}
	
	//test rule3
	@Test
	public void testRuleThree() {
		int[] nums = new int[] {3,3,3,5,5}; 
		
		assertEquals(slot.payOff(nums), 5000, "failed testRuleThree()");
	}
	
	//test rule3&6
	@Test
	public void testRuleThreeSix() {
		int[] nums = new int[] {3,3,3,9,9}; 
		
		assertEquals(slot.payOff(nums), 5007, "failed testRuleThreeSix()");
	}
	
	//test rule3&7
	@Test
	public void testRuleThreeSeven() {
		int[] nums = new int[] {3,3,3,42,42}; 
		
		assertEquals(slot.payOff(nums), 5002, "failed testRuleThreeSeven()");
	}
	
	//test rule3&8
	@Test
	public void testRuleThreeEight() {
		int[] nums = new int[] {3,3,3,2,2}; 
		
		assertEquals(slot.payOff(nums), 5003, "failed testRuleThreeEight()");
	}
	
	//test rule3&6&7
	@Test
	public void testRuleThreeSixSeven() {
		int[] nums = new int[] {9,9,9,42,42}; 
		
		assertEquals(slot.payOff(nums), 5009, "failed testRuleThreeSixSeven()");
	}
	
	//test rule3&6&8
	@Test
	public void testRuleThreeSixEight() {
		int[] nums = new int[] {9,9,9,2,2}; 
		
		assertEquals(slot.payOff(nums), 5010, "failed testRuleThreeSixEight()");
	}
	
	//test rule3&7&8
	@Test
	public void testRuleThreeSevenEight() {
		int[] nums = new int[] {42,42,42,2,2}; 
		
		assertEquals(slot.payOff(nums), 5005, "failed testRuleThreeSevenEight()");
	}
	
	//test rule3&6&7&8
	@Test
	public void testRuleThreeSixSevenEight() {
		int[] nums = new int[] {4,4,4,42,42}; 
		
		assertEquals(slot.payOff(nums), 5012, "failed testRuleThreeSixSevenEight()");
	}
	
	//test rule4
	@Test
	public void testRuleFour() {
		int[] nums = new int[] {3,3,3,5,6}; 
		
		assertEquals(slot.payOff(nums), 100, "failed testRuleFour()");
	}
	
	//test rule4&6
	@Test
	public void testRuleFourSix() {
		int[] nums = new int[] {3,3,3,5,9}; 
		
		assertEquals(slot.payOff(nums), 107, "failed testRuleFourSix()");
	}
	
	//test rule4&7
	@Test
	public void testRuleFourSeven() {
		int[] nums = new int[] {3,3,3,5,42}; 
		
		assertEquals(slot.payOff(nums), 102, "failed testRuleFourSeven()");
	}
		
	//test rule4&8
	@Test
	public void testRuleFourEight() {
		int[] nums = new int[] {3,3,3,5,2}; 
		
		assertEquals(slot.payOff(nums), 103, "failed testRuleFourEight()");
	}
	
	//test rule4&6&7
	@Test
	public void testRuleFourSixSeven() {
		int[] nums = new int[] {3,3,3,9,42}; 
		
		assertEquals(slot.payOff(nums), 109, "failed testRuleFourSixSeven()");
	}
	
	//test rule4&6&8
	@Test
	public void testRuleFourSixEight() {
		int[] nums = new int[] {3,3,3,9,2}; 
		
		assertEquals(slot.payOff(nums), 110, "failed testRuleFourSixEight()");
	}
	
	//test rule4&7&8
	@Test
	public void testRuleFourSevenEight() {
		int[] nums = new int[] {3,3,3,42,2}; 
		
		assertEquals(slot.payOff(nums), 105, "failed testRuleFourSevenEight()");
	}
	
	//test rule4&6&7&8
	@Test
	public void testRuleFourSixSevenEight() {
		int[] nums = new int[] {3,3,3,4,42}; 
		
		assertEquals(slot.payOff(nums), 112, "failed testRuleFourSixSevenEight()");
	}
	
	//test rule5
	@Test
	public void testRuleFive() {
		int[] nums = new int[] {3,3,5,6,7}; 
		
		assertEquals(slot.payOff(nums), 10, "failed testRuleFive()");
	}
	
	//test rule5&6
	@Test
	public void testRuleFiveSix() {
		int[] nums = new int[] {3,3,5,6,9}; 
		
		assertEquals(slot.payOff(nums), 17, "failed testRuleFiveSix()");
	}
	
	//test rule5&7
	@Test
	public void testRuleFiveSeven() {
		int[] nums = new int[] {3,3,5,6,42}; 
		
		assertEquals(slot.payOff(nums), 12, "failed testRuleFiveSeven()");
	}
		
	//test rule5&8
	@Test
	public void testRuleFiveEight() {
		int[] nums = new int[] {3,3,5,6,2}; 
		
		assertEquals(slot.payOff(nums), 13, "failed testRuleFiveEight()");
	}
	
	//test rule5&6&7
	@Test
	public void testRuleFiveSixSeven() {
		int[] nums = new int[] {3,3,5,9,42}; 
		
		assertEquals(slot.payOff(nums), 19, "failed testRuleFiveSixSeven()");
	}
	
	//test rule5&6&8
	@Test
	public void testRuleFiveSixEight() {
		int[] nums = new int[] {3,3,5,9,2}; 
		
		assertEquals(slot.payOff(nums), 20, "failed testRuleFiveSixEight()");
	}
	
	//test rule5&7&8
	@Test
	public void testRuleFiveSevenEight() {
		int[] nums = new int[] {3,3,5,42,2}; 
		
		assertEquals(slot.payOff(nums), 15, "failed testRuleFiveSevenEight()");
	}
	
	//test rule5&6&7&8
	@Test
	public void testRuleFiveSixSevenEight() {
		int[] nums = new int[] {3,3,5,4,42}; 
		
		assertEquals(slot.payOff(nums), 22, "failed testRuleFiveSixSevenEight()");
	}
	
	//test rule6
	@Test
	public void testRuleSix() {
		int[] nums = new int[] {3,5,6,7,9}; 
		
		assertEquals(slot.payOff(nums), 7, "failed testRuleSix()");
	}
	
	//test rule7
	@Test
	public void testRuleSeven() {
		int[] nums = new int[] {3,5,6,7,42}; 
		
		assertEquals(slot.payOff(nums), 2, "failed testRuleSeven()");
	}
	
	//test rule8
	@Test
	public void testRuleEight() {
		int[] nums = new int[] {3,5,6,7,2}; 
		
		assertEquals(slot.payOff(nums), 3, "failed testRuleEight()");
	}
	
	//test rule6&7
	@Test
	public void testRuleSixSeven() {
		int[] nums = new int[] {3,5,6,9,42};
		
		assertEquals(slot.payOff(nums), 9, "failed testRuleSixSeven()");
	}
	
	//test rule6&8
	@Test
	public void testRuleSixEight() {
		int[] nums = new int[] {3,5,6,9,2};
		
		assertEquals(slot.payOff(nums), 10, "failed testRuleSixEight()");
	}
	
	//test rule7&8
	@Test
	public void testRuleSevenEight() {
		int[] nums = new int[] {3,5,6,42,2};
		
		assertEquals(slot.payOff(nums), 5, "failed testRuleSevenEight()");
	}
	
	//test rule6&7&8
	@Test
	public void testRuleSixSevenEight() {
		int[] nums = new int[] {3,5,9,42,2};
		
		assertEquals(slot.payOff(nums), 12, "failed testRuleSixSevenEight()");
	}
}

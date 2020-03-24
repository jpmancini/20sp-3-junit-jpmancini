import java.util.Random;

public class BetterSlot {
	
	public static void main(String args[]) {
		/*BetterSlot slot = new BetterSlot();
		int[] testAr = {3,3,3,5,6};
		
		int testPay = slot.payOff(testAr);
		
		System.out.println(testPay);*/
	}
	
	public BetterSlot() {};
	
	public int[] pullTheLever() {
		int[] nums = new int[5];
		Random r = new Random();
		
		for(int i = 0; i < 5; i++) {
			nums[i] = r.nextInt(50) + 1;
		}
		
		return nums;
	}
	
	public int payOff( int[] values ) {
		int payout = 0;
		int[] counts = {0,0,0,0,0};
		
		boolean rule1 = false, rule2 = false, rule4 = false, rule5 = false;
		boolean rule6 = false, rule7 = false, rule8 = false;
		
		
		
		for(int i = 0; i < 5; i++) {
			
			double d = values[i];
			double root = Math.sqrt(d);
			if(root % 1 == 0) {
				rule6 = true;
			}
			
			if(values[i] == 42) {
				rule7 = true;
			}
			
			double valueLog = Math.log(values[i]);
			double baseTwo = valueLog / Math.log(2);
					
			//if the logbase2 of values[i] is a whole number => rule8 = true
			if (baseTwo % 1 == 0) {
				rule8 = true;
			}
				
			for(int j = 0; j < 5; j++) {
				if(values[j] == values[i]) {
					counts[i]++;
				}
			}
			
		}
		
		for(int i = 0; i < 5; i++) {
			//System.out.println(counts[i]);
			if(counts[i] == 5) {
				//System.out.println("rule1");
				rule1 = true;
			}
			if(counts[i] == 4) {
				//System.out.println("rule2");
				rule2 = true;
			}
			if(counts[i] == 3) {				
				//System.out.println("rule4");
				rule4 = true;
			}
			if(counts[i] == 2) {				
				//System.out.println("rule5");
				rule5 = true;
			}
		}
		
		if(rule1 == true) {
			payout += 1000000;
		}
		else if(rule2 == true) {
			payout += 10000;
		}
		else if(rule4 == true && rule5 == true) {
			payout += 5000;
		}
		else if(rule4 == true) {
			payout += 100;
		}
		else if(rule5 == true) {
			payout += 10;
		}
		
		if(rule6 == true) {
			payout += 7;
		}
		if(rule7 == true) {
			payout += 2;
		}
		if(rule8 == true) {
			payout += 3;
		}
		
		return payout;
		
	}
	
}


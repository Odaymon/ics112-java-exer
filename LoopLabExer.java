/**
 * Author: Odaymon
 * Date: Feb 2016
 * Description:
 * Lab Exercise for nesting loops.
 * Prints a diamond using two methods being called by
 * the main method.
 */
class LoopLabExer {
	// Calls other methods to print the full image
	public static void main(String[] args){
		methodA();
		methodB();
	}
	/* It uses a nested for-loop to print the 1st part of the diamond. */
	public static void methodA(){
		// Per line
		for(int j = 0; j<11; j++){
			// Print spaces
			for(int i = 11-j; i>=0; i--){
				System.out.print(" ");
			}
			// Print 1st asterisk
			System.out.print("*");
			// Print 12 asterisks
			if(j == 6){
				for(int l = 12; l>0; l--){
					System.out.print("*");
				}
			}
			// Space after the 1st asterisk
			for(int k = j; k>0; k--){
				System.out.print(" ");
				if(k > 1){
					System.out.print(" ");
				}
			}
			// Print 2nd asterisk
			if(j > 0 && j != 6){
				System.out.print("*");
			}
			// New line
			System.out.print("\n");
		}
	}
	/* It uses a nested for-loop to print the 2nd part of the diamond. */
	public static void methodB(){
		// Per line
		for(int j = 0; j<11; j++){
			// Print spaces
			for(int i = 0; i<=j; i++){
				System.out.print(" ");
			}
			// Print 1st asterisk
			System.out.print("*");
			// Print 12 asterisks
			if(j == 5){
				for(int l = 12; l>0; l--){
					System.out.print("*");
				}
			}
			// Space after the 1st asterisk
			for(int k = 11-j; k>0; k--){
				System.out.print(" ");
				if(k > 1){
					System.out.print(" ");
				}
			}
			// Print 2nd asterisk
			if(j < 11 && j != 5){
				System.out.print("*");
			}
			// New line
			System.out.print("\n");
		}
	}
}

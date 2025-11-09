// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int Number = Integer.parseInt(args[0]);
		for (int j = 1; j<= Number; j++) {
		if (j == 1){
		System.out.println("1 4 2 1 (4)");
		continue;}
		
		int CurrentNumber = j;
		int Steps = 1;
		System.out.print(CurrentNumber + " ");

		while (CurrentNumber != 1) {
			if (CurrentNumber % 2 == 0) {
				CurrentNumber = CurrentNumber / 2; }
			else {
				CurrentNumber = 3 * CurrentNumber + 1; }
			Steps++;  
			System.out.print(CurrentNumber + " "); }
		System.out.println("(" + Steps + ")");}
		System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1." );
	
	}
}

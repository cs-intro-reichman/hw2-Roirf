// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		double Pie = Math.PI;
		System.out.println("Pi according to Java: " + Pie);
		int amount = Integer.parseInt(args[0]);
		double orinalPie = 1.0;
		double k = 3.0;
		for (int i = 1; i < amount; i++, k += 2) {
			if (i % 2 == 0) {
				orinalPie += (1 / k );
			} else {
				orinalPie -= (1 / k );}
		}
		orinalPie = orinalPie * 4;
		System.out.println("Pi, approximated:     " + orinalPie);
	
	}
}

package it.unibs.ing.ieee.iproblemi;

public class Problema1 {

	public static void main(String[] args) {
		LogTime log = new LogTime();

		long below = 1000000000;

		log.getTime();
		//Algoritmo superbello di Vezz
		long n5 = (long) Math.ceil(below / 5);
		long n3 = (long) Math.ceil(below / 3);

		long sum = ((n3 * 3 * (1 + n3)) + (n5 * 5 * (1 + n5))) / 2;
		System.err.println(sum);

		log.getTime();
		//Algoritmo di Michele Dusi
		sum = 0;
		for (long i = 3; i <= below; i += 3) {
			sum += i;
		}
		for (long i = 5; i <= below; i += 5) {
			sum += i;
		}

		System.err.println(sum);

		log.getTime();

		log.getDelta(LogTime.MILLI);
		log.getDelta(LogTime.SECOND);
		log.getDelta(LogTime.MINUTE);

	}

}

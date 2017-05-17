package it.unibs.ing.ieee.iproblemi;

import java.util.Arrays;

import javax.xml.stream.XMLStreamException;

public class Problema2 {
	static final int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200 };
//	static final int coins[] = { 1, 5, 10, 25, 50, 100 };

	public static void esegui() {
		int soldi = 100;

		LogTime log = new LogTime();

		log.getTime();
		long c = count(coins, coins.length, soldi);
		log.getTime();
		
		System.out.println(c);

		try {
			XmlWriter.saveTimeStamp("problema2.xml", log.getTimestamp().get(0), log.getTimestamp().get(1));
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}

	}

	public static long count(int S[], int m, int n) {
		long[] table = new long[n + 1];

		// Initialize all table values as 0
		Arrays.fill(table, 0); // O(n)

		// Base case (If given value is 0)
		table[0] = 1;

		// Pick all coins one by one and update the table[]
		// values after the index greater than or equal to
		// the value of the picked coin
		for (int i = 0; i < m; i++) {
			for (int j = S[i]; j <= n; j++) {
				table[j] += table[j - S[i]];
				// System.out.println(table[j]);
			}
		}

		return table[n];
	}

}

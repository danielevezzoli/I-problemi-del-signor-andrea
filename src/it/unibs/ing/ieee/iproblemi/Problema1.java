package it.unibs.ing.ieee.iproblemi;

public class Problema1 {

	public static void main(String[] args) {
		int below = 16;
		int n5 = (int) Math.ceil(below / 5);
		int n3 = (int) Math.ceil(below / 3);

		int sum3 = (n3 * 3 * (1 + n3)) / 2;
		int sum5 = (n5 * 5 * (1 + n5)) / 2;

		int sum = sum3 + sum5;

		System.out.println(sum);

	}

}

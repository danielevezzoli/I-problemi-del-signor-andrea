package it.unibs.ing.ieee.iproblemi;

public class BigNumber implements Comparable<BigNumber>{
	public long base;
	public long exp;
	private double dBase = 0;
	private double dExp = 0;
	
	private double number;

	public BigNumber(long base, long exp) {
		super();
		this.base = base;
		this.exp = exp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d ^ %d -> %f", base, exp, number);
	}

	public static long firstDigit(long n) {
		while (n < -9 || 9 < n)
			n /= 10;
		return Math.abs(n);
	}
	
	public static double otherDigits(long n) {
		String tmp = String.valueOf(n);
		tmp = tmp.substring(1);
		return Double.parseDouble(tmp) / Math.pow(10, 6);
	}

	public void convertToDouble() {
//		dBase = firstDigit(base) + otherDigits(base);
//		dExp = firstDigit(exp) + otherDigits(exp);
		
		dBase = base / Math.pow(10, 6);
		dExp = exp / Math.pow(10, 6);
	}
	
	public void generateNumber() {
//		number = Math.pow(dBase, dExp);
		number = (exp / Math.pow(10, 5)) * log100(base);
	}
	
	private double log100(long n) {
		return Math.log10(n) / Math.log10(100);

	}

	@Override
	public int compareTo(BigNumber bn) {
		return Double.compare(this.number, bn.getNumber());
	}

	public double getNumber() {
		return number;
	}

}

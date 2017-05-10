package it.unibs.ing.ieee.iproblemi;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.stream.XMLStreamException;

public class Problema3 {
	public static void esegui() {

		XmlParser xp = new XmlParser();
		ArrayList<BigNumber> lista = new ArrayList<>();
		LogTime log = new LogTime();
//		BigInteger bg;

		try {
			lista = xp.parseXml("inProbC.xml");
		} catch (FileNotFoundException | XMLStreamException e) {
			System.err.println("File non presente");
		}

		log.getTime();

//		bg = new BigInteger(String.valueOf(lista.get(0).base));
//		bg = bg.pow((int) lista.get(0).base);
//
//		System.out.println(bg.bitLength());

		log.getTime();

		for (BigNumber b : lista) {
			b.convertToDouble();
			b.generateNumber();
			// System.out.println(b);
		}

		Collections.sort(lista);
		int i = 1;
		for (BigNumber bigNumber : lista) {
			System.out.println(i + ":\t" + bigNumber);
			i++;
		}

		log.getTime();

		System.err.println("Il numero più piccolo è: " + lista.get(0).getNumber());
		System.err.println("Il numero più grande è: " + lista.get(lista.size() - 1).getNumber());
		double mediana = ((lista.get(499).getNumber() + lista.get(500).getNumber()) / 2);
		System.err.println("La mediana è : " + mediana);
		System.out.println("\n\n");

		log.getDelta(TimeStamp.MILLI);
	}

}

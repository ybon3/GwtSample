package com.dtc.test.server;

import org.fluttercode.datafactory.impl.DataFactory;

public class MyDataFactory {
	public static void main(String[] args) {
		DataFactory df = new DataFactory();
		for (int i = 0; i < 100; i++) {
			String s = "new Data(\"" + df.getRandomChars(20) + "\"," +
					"\""+df.getFirstName()+"\"," +
					"\""+df.getLastName()+"\"," +
					"\""+df.getPrefix(df.getNumberBetween(0, Integer.MAX_VALUE))+"\"," +
					"\""+df.getSuffix(df.getNumberBetween(0, Integer.MAX_VALUE))+"\")";
			System.out.println(s + ",");
		}
	}

}

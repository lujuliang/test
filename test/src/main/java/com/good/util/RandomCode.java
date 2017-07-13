package com.good.util;

import java.util.Random;

public final class RandomCode {

	public static String getRandomCharAndNumr(Integer length) {
		String str = "";
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			boolean b = random.nextBoolean();
			if (b) { // 

				str += (char) (97 + random.nextInt(26));//
			} else { // 
				str += String.valueOf(random.nextInt(10));
			}
		}
		return str;
	}
	
	public static String getRandomNumr(Integer length) {
		String str = "";
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			str += String.valueOf(random.nextInt(10));
		}
		return str;
	}

}

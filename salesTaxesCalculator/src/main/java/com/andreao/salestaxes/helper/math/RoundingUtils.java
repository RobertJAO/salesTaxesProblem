package com.andreao.salestaxes.helper.math;

import java.math.BigDecimal;

public class RoundingUtils {
	
	private RoundingUtils() {
		super();
	}
	
	public static BigDecimal roundToTheNearest005(BigDecimal n) {
		return BigDecimal.valueOf(RoundingUtils.roundToTheNearest005(n.doubleValue()));
	}

	public static double roundToTheNearest005(double n) {
		return Math.ceil(n * 20.0) / 20.0;
	}
	
}

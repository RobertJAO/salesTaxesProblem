package com.andreao.salestaxes.test;

import org.junit.Assert;
import org.junit.Test;

import com.andreao.salestaxes.helper.math.RoundingUtils;

public class RoundingUtilsTest {
	
	@Test
	public void shouldRoundUpToTheNearest005() {
		double result = RoundingUtils.roundToTheNearest005(0.5625d);
		Assert.assertEquals(0.60d, result, 0);
	}

}

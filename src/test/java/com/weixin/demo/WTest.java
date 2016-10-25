package com.weixin.demo;

import org.junit.Assert;
import org.junit.Test;

public class WTest {
	/**
	 * Unit test for simple App.
	 */
	@Test
	public void test() {
		TestApp app = new TestApp();
		Assert.assertEquals(15, app.getDataSum(7, 8));
	}
}

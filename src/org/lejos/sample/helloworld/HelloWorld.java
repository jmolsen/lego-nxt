package org.lejos.sample.helloworld;

import lejos.nxt.LCD;

/**
 * Lego NXT Hello World
 */
public class HelloWorld {
	public static void main(String[] aArg) throws Exception {
		LCD.drawString("Hello World", 3, 4);
		Thread.sleep(2000);
	}
}

package com.wsl.util;

import java.util.Random;

public class IDutil {
	public static int getID(){
		Random random = new Random();
		return random.nextInt(1000000000);
	}
}

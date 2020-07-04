package com.practice.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomNumbers implements Runnable {

	@Override
	public void run() {

		final Random rndom = new Random();
		final List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 1000; i++)
			list.add(rndom.nextInt(100) + 1);
		Collections.sort(list);

	}
}

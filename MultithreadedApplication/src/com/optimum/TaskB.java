package com.optimum;

public class TaskB implements Runnable {

	int resultB;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			this.resultB = 3;
		} catch (InterruptedException e) {
			e.printStackTrace();
			resultB = 0;

		}
	}

	public int getResult() {
		return this.resultB;
	}

}

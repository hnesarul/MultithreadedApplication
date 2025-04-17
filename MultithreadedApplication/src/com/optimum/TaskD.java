package com.optimum;

public class TaskD implements Runnable {

	int resultD;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			this.resultD = 5 + resultD;
		} catch (InterruptedException e) {
			e.printStackTrace();
			resultD = 0;

		}
	}

	public int getResult() {
		return this.resultD;
	}

	public void setResult(int result) {
		this.resultD = result;
	}

}

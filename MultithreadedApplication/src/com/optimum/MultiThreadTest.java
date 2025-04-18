package com.optimum;

public class MultiThreadTest {

	public static void main(String[] args) {

		TaskA taska = new TaskA();
		TaskB taskb = new TaskB();
		int resultA = 0, resultB = 0;
		Thread threada = new Thread(taska);
		Thread threadb = new Thread(taskb);

		System.out.println("Thread A and B starting");

		threada.start();
		threadb.start();

		try {
			threada.join();
			threadb.join();
			resultA = taska.getResult();
			resultB = taskb.getResult();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		TaskC taskc = new TaskC();
		TaskD taskd = new TaskD();
		int resultC = 0, resultD = 0;
		Thread threadc = new Thread(taskc);
		Thread threadd = new Thread(taskd);

		System.out.println("Thread C and D starting");

		taskc.setResult(resultA);
		taskd.setResult(resultB);

		threadc.start();
		threadd.start();

		try {
			threadc.join();
			threadd.join();
			resultC = taskc.getResult();
			resultD = taskd.getResult();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		int finalResult = resultC + resultD;

		TaskF taskf = new TaskF();
		taskf.setResult(finalResult);
		Thread threadf = new Thread(taskf);

		threadf.start();

	}

}

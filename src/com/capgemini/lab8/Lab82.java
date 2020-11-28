package com.capgemini.lab8;

import java.util.concurrent.TimeUnit;

public class Lab82 implements Runnable {

	

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		//long elapsedSeconds;
		long secElapsed;
		//long startTime = System.currentTimeMillis();
		long start= System.currentTimeMillis();;
		do {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			long timeElapsed = System.currentTimeMillis() - start;
			secElapsed = timeElapsed / 1000;
			if(secElapsed==10) {
				start=System.currentTimeMillis();
			}
			System.out.println("Time -> 00:"+secElapsed);
		}while(secElapsed<=10);
		
	}

}

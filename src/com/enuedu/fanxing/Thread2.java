package com.enuedu.fanxing;

public class Thread2 extends Thread {
public void run() {
	for(int i=1;i<=20;i++) {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ºÈ¾Æ"+i);
	}
}
}

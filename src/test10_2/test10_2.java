package test10_2;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

class TimerThread extends Thread{
	int n = 0;
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
				
			}
			catch(InterruptedException e) {return;}
		}
	}
}
public class test10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerThread th = new TimerThread();
		th.start();
	}

}



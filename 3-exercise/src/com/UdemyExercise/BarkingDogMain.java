package com.UdemyExercise;
public class BarkingDogMain {

	public static void main(String[] args) {
		
		BarkingDog bark = new BarkingDog();
		boolean  wakeUp = true;
		
		
		wakeUp = bark.shouldWakeUp(true, 1);
		System.out.println(wakeUp);
		wakeUp = bark.shouldWakeUp(false, 2);
		System.out.println(wakeUp);
		wakeUp = bark.shouldWakeUp(true, 8);
		System.out.println(wakeUp);
		wakeUp = bark.shouldWakeUp(true, -1);
		System.out.println(wakeUp);
	}

}

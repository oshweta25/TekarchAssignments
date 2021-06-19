package com.shweta.assignment.inheritance;

public class MobileOperatingSystem extends OperatingSystem {

	public MobileOperatingSystem(String name, Version version) {
		super(name, version);
	}
	
	
	public void run() {
		System.out.println("Running a Mobile Operating System..");
	}
	
}

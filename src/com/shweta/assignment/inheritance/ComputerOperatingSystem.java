package com.shweta.assignment.inheritance;

public class ComputerOperatingSystem extends OperatingSystem {

	public ComputerOperatingSystem(String name, Version version) {
		super(name, version);
	}
	
	public void run() {
		System.out.println("Computer Operating System running");
	}

}

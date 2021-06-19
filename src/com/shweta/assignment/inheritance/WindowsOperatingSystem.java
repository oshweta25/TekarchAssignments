package com.shweta.assignment.inheritance;

public class WindowsOperatingSystem extends ComputerOperatingSystem{

	private static final String NAME = "Windows";
	
	public WindowsOperatingSystem(Version version) {
		super(NAME, version);
	}
	
	public void run() {
		System.out.println("Windows Operating System running");
	}

}

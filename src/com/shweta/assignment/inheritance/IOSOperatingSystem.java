package com.shweta.assignment.inheritance;

public class IOSOperatingSystem extends MobileOperatingSystem{

	private static final String NAME = "iOS";
	
	public IOSOperatingSystem(Version version) {
		super(NAME, version);
	}

	public void run() {
		System.out.println("IOS Operating System running");
	}
}

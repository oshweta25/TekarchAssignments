package com.shweta.assignment.inheritance;

public class MacOperatingSystem extends ComputerOperatingSystem{
	
	private static final String NAME = "macOS";
	
	public MacOperatingSystem(Version version) {
		super(NAME, version);
	}
	
	public static void main(String[] args) {
		Version version = new Version(10, 1, 0);
		AndroidOperatingSystem android = new AndroidOperatingSystem(version);
		android.setReleaseName("Android1");
		System.out.println(android);

	}
	
}

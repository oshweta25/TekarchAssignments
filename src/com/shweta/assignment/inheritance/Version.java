package com.shweta.assignment.inheritance;

public class Version {
	private int major;
	private int minor;
	private int revision;
	
	public Version(int major, int minor, int revision) {
		this.major = major;
		this.minor = minor;
		this.revision = revision;		
	}

	public int getMajor() {
		return major;
	}

	public int getMinor() {
		return minor;
	}

	public int getRevision() {
		return revision;
	}

	public String getVersionAsString() {
		return this.major + "." + this.minor + "." + this.revision;
	}
	
	public String toString() {
		return getVersionAsString();
	}
	
	public static void main(String[] args) {
		Version v1 = new Version(1,0,0);
		System.out.println(v1);
	}
}

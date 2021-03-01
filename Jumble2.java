package com.sangamone;

public class Jumble2 {
	public String encdec1(String old, int digit, String type)
	{
		String oldname = old;
		String newname = "";
		int offset = type.equals("dec")?-digit:digit;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int length1 = alphabet.length();
		for(int i=0; i<oldname.length(); i++)
		{
			char temp = oldname.charAt(i);
			int oldposition = alphabet.indexOf(temp);
			int newposition = (oldposition+offset)%length1;
			temp = alphabet.charAt(newposition);
			newname = newname + temp;
		}
		return newname;
	}
	
	public static void main(String[] args) {
		Jumble2 obj = new Jumble2();
		String encoded = obj.encdec1("neha", 1, "enc");
		System.out.println(encoded);
		String decoded = obj.encdec1(encoded, 1, "dec");
		System.out.println(decoded);
	}
}

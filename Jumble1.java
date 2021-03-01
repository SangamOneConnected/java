package com.sangamone;

public class Jumble1 {
	public String encrypt1(String old, int digit)
	{
		String oldname = old;
		String newname = "";
		int offset = digit;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int length1 = alphabet.length();
		for(int i=0; i<oldname.length(); i++)
		{
			char temp = oldname.charAt(i);
			int oldposition = alphabet.indexOf(temp);
			int newposition = (oldposition + offset)%length1;
			temp = alphabet.charAt(newposition);
			newname = newname + temp;
		}
		return newname;
	}
	
	public String decrypt1(String old, int digit)
	{
		String oldname = old;
		String newname = "";
		int offset = digit;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int length1 = alphabet.length();
		for(int i=0; i<oldname.length(); i++)
		{
			char temp = oldname.charAt(i);
			int oldposition = alphabet.indexOf(temp);
			int newposition = (oldposition - offset)%length1;
			temp = alphabet.charAt(newposition);
			newname = newname + temp;
		}
		return newname;
	}
	
	
	public static void main(String[] args) {
		
		Jumble1 obj = new Jumble1();
		String encoded = obj.encrypt1("neha", 1);
		System.out.println(encoded);
		String decoded = obj.decrypt1(encoded, 1);
		System.out.println(decoded);
	}
}



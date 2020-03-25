package com.String.text;

public class Program1_4 {
	public static void main(String args[]) {
		String str = "Hello He World";
		//×Ö·ûÌæ»»
		System.out.println(str.replace("H", "W") + "\n");
		//×Ö·û´®Ìæ»»
		System.out.println(str.replaceFirst("He","Wa") + "\n");
		//×Ö·û´®È«²¿Ìæ»»
		System.out.println(str.replaceAll("He", "Ha") + "\n");
	}
}

package com.String.text;

public class Program1_3 {
	public static void main(String args[]) {
		String str = "this is Java";
		System.out.println(removeCharAt(str,3));
	}

	private static String removeCharAt(String s, int pos) {
		// TODO 自动生成的方法存根
		return s.substring(0,pos) + s.substring(pos + 1);
	}
}

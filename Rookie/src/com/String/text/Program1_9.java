package com.String.text;

public class Program1_9 {
	public static void main (String[] args) {
		String first_str = "Welcome to Microsoft";
		String second_str = "I work with microsoft";
		boolean match1 = first_str.regionMatches(11,second_str,12,9);
		boolean match2 = first_str.regionMatches(true, 11, second_str,12,9);
		System.out.println("区分大小写返回值：" + match1);
		System.out.println("不区分大小写返回值：" + match2);
	}
}
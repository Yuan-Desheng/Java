package com.String.text;

public class Program1_5 {
	public static void main(String arga[]) {
		String string = "run";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("字符串反转前：" + string);
		System.out.println("字符串反转后：" + reverse);
		String str2 = "";

//		for(int i=string.length()-1;i >= 0 ;i--) {
//			System.out.println(str2);
//			str2 += string.substring(i);
//			System.out.println(i);
//		}
//		System.out.println(str2);
	}
}

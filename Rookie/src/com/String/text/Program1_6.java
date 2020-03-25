package com.String.text;
//字符串第一次出现的位置
public class Program1_6 {
	public static void main(String[] args) {
		String strOrig = "Google Runoob Taobao Runoob";
		int intIndex = strOrig.indexOf("Runoob");
		if (intIndex == -1) {
			System.out.println("没有找到字符串 Runoob");
		}
		else {
			System.out.println("Runoob字符串的位置："+ intIndex);
		}
	}
}
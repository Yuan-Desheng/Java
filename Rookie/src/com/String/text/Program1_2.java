package com.String.text;
//查找字符串最后一次出现的位置
public class Program1_2 {
	public static void main(String[] args) {
		String strOrig = "Hello world ,Hello Runoo";
		int lastIndex = strOrig.lastIndexOf("Runoob");
		if(lastIndex == -1) {
			System.out.println("没有找到字符串Runoob");
			System.out.println(lastIndex);
		}
		else {
			System.out.println("Runoob 字符串最后出现的位置：" + lastIndex);
		}
	}
}
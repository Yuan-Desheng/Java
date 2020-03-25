package com.String.text;
public class Program1_1 {
	public static void main(String args[]) {
		String str = "Hello World";					//新建字符串 str 赋值 Hello World
		String anotherString = "hello world";		//另一个字符串 赋值 hello world
		Object objstr = str;						//新建Object类型 
		
		/*果第一个字符和参数的第一个字符不等，结束比较，返回他们之间的差值，如果第一个字符和参数的第一个字符相等，
		 * 则以第二个字符和参数的第二个字符做比较，以此类推,直至比较的字符或被比较的字符有一方结束。*/
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));		//不区分大小写比较字符串
		System.out.println(str.compareTo(objstr.toString()));			//返回一个表示指定 char 值的 String 对象。结果是长度为 1 的字符串，仅由指定的 char 组成。
	}	
}
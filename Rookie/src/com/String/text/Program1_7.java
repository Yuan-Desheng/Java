package com.String.text;

public class Program1_7 {
	public static void main(String args[]) {
		String str = "www-runoob-com";
		String[] temp;
		String delimeter = "-";
		temp = str.split(delimeter);
		//forѭ������
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i] + "\n");
		}
		//java for each ��������
		System.out.println("-----java for each ѭ����������-----");
		for(String x:temp) {
			System.out.println(x + "\n");
		}
	}
}
package com.String.text;

public class Program1_4 {
	public static void main(String args[]) {
		String str = "Hello He World";
		//�ַ��滻
		System.out.println(str.replace("H", "W") + "\n");
		//�ַ����滻
		System.out.println(str.replaceFirst("He","Wa") + "\n");
		//�ַ���ȫ���滻
		System.out.println(str.replaceAll("He", "Ha") + "\n");
	}
}

package com.String.text;
//�ַ�����һ�γ��ֵ�λ��
public class Program1_6 {
	public static void main(String[] args) {
		String strOrig = "Google Runoob Taobao Runoob";
		int intIndex = strOrig.indexOf("Runoob");
		if (intIndex == -1) {
			System.out.println("û���ҵ��ַ��� Runoob");
		}
		else {
			System.out.println("Runoob�ַ�����λ�ã�"+ intIndex);
		}
	}
}
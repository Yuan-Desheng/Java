package com.String.text;
//�����ַ������һ�γ��ֵ�λ��
public class Program1_2 {
	public static void main(String[] args) {
		String strOrig = "Hello world ,Hello Runoo";
		int lastIndex = strOrig.lastIndexOf("Runoob");
		if(lastIndex == -1) {
			System.out.println("û���ҵ��ַ���Runoob");
			System.out.println(lastIndex);
		}
		else {
			System.out.println("Runoob �ַ��������ֵ�λ�ã�" + lastIndex);
		}
	}
}
package com.String.text;
public class Program1_1 {
	public static void main(String args[]) {
		String str = "Hello World";					//�½��ַ��� str ��ֵ Hello World
		String anotherString = "hello world";		//��һ���ַ��� ��ֵ hello world
		Object objstr = str;						//�½�Object���� 
		
		/*����һ���ַ��Ͳ����ĵ�һ���ַ����ȣ������Ƚϣ���������֮��Ĳ�ֵ�������һ���ַ��Ͳ����ĵ�һ���ַ���ȣ�
		 * ���Եڶ����ַ��Ͳ����ĵڶ����ַ����Ƚϣ��Դ�����,ֱ���Ƚϵ��ַ��򱻱Ƚϵ��ַ���һ��������*/
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));		//�����ִ�Сд�Ƚ��ַ���
		System.out.println(str.compareTo(objstr.toString()));			//����һ����ʾָ�� char ֵ�� String ���󡣽���ǳ���Ϊ 1 ���ַ���������ָ���� char ��ɡ�
	}	
}
package TestExample;

import java.util.Random;

public class MainClass01 {
	public static void main(String[] args) {
		//java.util ��Ű���� �ִ� Random Ŭ���� import �ؼ� 
		//��ü ������ �������� ran �̶�� ���� ������ ��´�. 
		Random ran=new Random(); ///Random ��ü �������� ���� ���ڸ� ȣ��.
		
		//int ���� ������ ������ ���� ����
		//int ranNum=ran.nextInt(0);
		
		//0-9 ���� ������ ������ ����
	//	int ranNum=ran.nextInt(10);
		
		//1-45 ���� ������ ������ ���� ����
		int ranNum=ran.nextInt(45)+1; 
		
		
		//����غ���
		System.out.println(ranNum);
	}
}

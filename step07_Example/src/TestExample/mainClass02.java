package TestExample;

import java.util.Scanner;

public class mainClass02 {
	public static void main(String[] args) {
		//Scanner ��ü �����ؼ�
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է�:");
		//���ڿ� �Է� �ޱ�
		String msg = scan.nextLine();
		
		System.out.println("msg:"+msg);
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}

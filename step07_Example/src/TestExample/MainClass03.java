package TestExample;

import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("����(0), ����(1), ��(2) �Է�:");
		//���� �Է� �ޱ�
		int inputNum=scan.nextInt();
		int showNum=ran.nextInt(3);
		
		if(inputNum==0) {
			//��ǻ�Ͱ� �����ϰ� ���ڸ� ����.
				System.out.println(showNum);
			if(showNum==1) {
				System.out.println("���� ���� : ���� "+""+" ��ǻ�Ͱ� ���� : ����");
				System.out.println("��� : �����ϴ�.");
			}else if(showNum==2){
				System.out.println("���� ���� : ���� "+""+" ��ǻ�Ͱ� ���� : ��");
				System.out.println("��� : �̰���ϴ�.");
			}else if(showNum==0) {
				System.out.println("���� ���� : ���� "+""+" ��ǻ�Ͱ� ���� : ����");
				System.out.println("��� : �����ϴ�.");
			}
		}else if(inputNum==1) {
				System.out.println(showNum);
			if(showNum==0) {
				System.out.println("���� ���� : ���� "+""+" ��ǻ�Ͱ� ���� : ����");
				System.out.println("��� : �̰���ϴ�.");
			}else if(showNum==1){
				System.out.println("���� ���� : ���� "+""+" ��ǻ�Ͱ� ���� : ����");
				System.out.println("��� : �����ϴ�.");
			}else if(showNum==2) {
				System.out.println("���� ���� : ���� "+""+" ��ǻ�Ͱ� ���� : ��");
				System.out.println("��� : �����ϴ�.");
			}
		}else if(inputNum==2) {
				System.out.println(showNum);
			if(showNum==0) {
				System.out.println("���� ���� : �� "+""+" ��ǻ�Ͱ� ���� : ����");
				System.out.println("��� : �̰���ϴ�.");
			}else if(showNum==1){
				System.out.println("���� ���� : �� "+""+" ��ǻ�Ͱ� ���� : ����");
				System.out.println("��� : �����ϴ�.");
			}else if(showNum==2) {
				System.out.println("���� ���� : �� "+""+" ��ǻ�Ͱ� ���� : ��");
				System.out.println("��� : �����ϴ�.");
			}
		}
		
		
	}
}

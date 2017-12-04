package TestExample;

import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("가위(0), 바위(1), 보(2) 입력:");
		//정수 입력 받기
		int inputNum=scan.nextInt();
		int showNum=ran.nextInt(3);
		
		if(inputNum==0) {
			//컴퓨터가 랜덤하게 숫자를 낸다.
				System.out.println(showNum);
			if(showNum==1) {
				System.out.println("내가 낸것 : 가위 "+""+" 컴퓨터가 낸것 : 바위");
				System.out.println("결과 : 졌습니다.");
			}else if(showNum==2){
				System.out.println("내가 낸것 : 가위 "+""+" 컴퓨터가 낸것 : 보");
				System.out.println("결과 : 이겼습니다.");
			}else if(showNum==0) {
				System.out.println("내가 낸것 : 가위 "+""+" 컴퓨터가 낸것 : 바위");
				System.out.println("결과 : 비겼습니다.");
			}
		}else if(inputNum==1) {
				System.out.println(showNum);
			if(showNum==0) {
				System.out.println("내가 낸것 : 바위 "+""+" 컴퓨터가 낸것 : 가위");
				System.out.println("결과 : 이겼습니다.");
			}else if(showNum==1){
				System.out.println("내가 낸것 : 바위 "+""+" 컴퓨터가 낸것 : 바위");
				System.out.println("결과 : 비겼습니다.");
			}else if(showNum==2) {
				System.out.println("내가 낸것 : 바위 "+""+" 컴퓨터가 낸것 : 보");
				System.out.println("결과 : 졌습니다.");
			}
		}else if(inputNum==2) {
				System.out.println(showNum);
			if(showNum==0) {
				System.out.println("내가 낸것 : 보 "+""+" 컴퓨터가 낸것 : 가위");
				System.out.println("결과 : 이겼습니다.");
			}else if(showNum==1){
				System.out.println("내가 낸것 : 보 "+""+" 컴퓨터가 낸것 : 바위");
				System.out.println("결과 : 졌습니다.");
			}else if(showNum==2) {
				System.out.println("내가 낸것 : 보 "+""+" 컴퓨터가 낸것 : 보");
				System.out.println("결과 : 비겼습니다.");
			}
		}
		
		
	}
}

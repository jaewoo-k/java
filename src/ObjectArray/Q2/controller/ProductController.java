package ObjectArray.Q2.controller;

import java.util.Scanner;

import ObjectArray.Q2.model.vo.Product;

public class ProductController {
	private Product[] pro = new Product[10];		// = null
	public static int count;			// = 현재 추가된 객체 수
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int input = 0;
		while(true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("원하는 메뉴번호를 입력해주세요.");
			input = sc.nextInt();
			
			if(input == 1){
				productInput();
			}else if(input == 2) {
				productPrint();
			}else if(input == 3) {
				productUpdate();
			}else if(input == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	private void productUpdate() {
		System.out.println("수정할 제품 번호(숫자)");
		int pId = sc.nextInt();
		System.out.println("수정할 제품명");sc.next();
		String pName = sc.nextLine();
		System.out.println("수정할 제품 가격");
		int price = sc.nextInt();
		System.out.println("수정할 제품 세금");
		double tax = sc.nextDouble();
		
		
				
	}

	public void productInput() {
		System.out.println("제품 번호(숫자)");
		int pId = sc.nextInt();
		System.out.println("제품명");
		sc.next();
		String pName = sc.nextLine();
		System.out.println("제품 가격");
		int price = sc.nextInt();
		System.out.println("제품 세금");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pId, pName, price, tax);
		count++;
	}
	
	public void productPrint() {
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] != null) {
			System.out.println(pro[i].information());
			}
		}
	}
	
}

package ObjectArray.Q2.controller;

import java.util.Scanner;

import ObjectArray.Q2.model.vo.Product;

public class ProductController {
	private Product[] pro = new Product[10];		// = null
	public static int count;			// = ���� �߰��� ��ü ��
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int input = 0;
		while(true) {
			System.out.println("=== �޴� ===");
			System.out.println("1. ��ǰ ���� �߰�");
			System.out.println("2. ��ǰ ��ü ��ȸ");
			System.out.println("9. ���α׷� ����");
			System.out.print("���ϴ� �޴���ȣ�� �Է����ּ���.");
			input = sc.nextInt();
			
			if(input == 1){
				productInput();
			}else if(input == 2) {
				productPrint();
			}else if(input == 3) {
				productUpdate();
			}else if(input == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	private void productUpdate() {
		System.out.println("������ ��ǰ ��ȣ(����)");
		int pId = sc.nextInt();
		System.out.println("������ ��ǰ��");sc.next();
		String pName = sc.nextLine();
		System.out.println("������ ��ǰ ����");
		int price = sc.nextInt();
		System.out.println("������ ��ǰ ����");
		double tax = sc.nextDouble();
		
		
				
	}

	public void productInput() {
		System.out.println("��ǰ ��ȣ(����)");
		int pId = sc.nextInt();
		System.out.println("��ǰ��");
		sc.next();
		String pName = sc.nextLine();
		System.out.println("��ǰ ����");
		int price = sc.nextInt();
		System.out.println("��ǰ ����");
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

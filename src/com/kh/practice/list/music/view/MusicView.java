package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	private Scanner sc=new Scanner(System.in);
	private MusicController mc=new MusicController();
	
	public void mainMenu() {
		while(true) {
				System.out.println("******* ���� �޴� *******");
				System.out.println("1.������ ��ġ�� �� �߰�");
				System.out.println("2.ù ��ġ�� �� �߰�");
				System.out.println("3.��ü �� ��� ���");
				System.out.println("4.Ư�� �� �˻�");
				System.out.println("5.Ư�� �� ����");
				System.out.println("6.Ư�� �� ���� ����");
				System.out.println("7.��� �������� ����");
				System.out.println("8.������ �������� ����");
				System.out.println("9.����"); 
				System.out.print("�޴� ��ȣ ���� :");
				int cho=sc.nextInt();
				
				switch(cho) {
					case 1 : addList();break;
					case 2 : addAtZero();break;
					case 3 : printAll();break;
					case 4 : searchMusic(); break;
					case 5 : removeMusic(); break;
					case 6 : setMusic(); break;
					case 7 : ascTitle(); break;
					case 8 : descSinger(); break;
					case 9 : System.out.println("����"); return;
					default : System.out.println("�߸� �Է��ϼ̽��ϴ�.�ٽ� �Է����ּ���.");
				}
				
		}
		
	}
	
	public void addList() {
		
		System.out.println("****** ������ ��ġ�� �� �߰� ******");
		
		      sc.nextLine();
			System.out.print("�� ��:");
				String title=sc.nextLine();
			System.out.print("������:");
				String singer=sc.nextLine();
			Music m=new Music(title,singer);
		int success=mc.addList(m);
			if(success==1) {
					System.out.println("�߰� ����");
			}else{System.out.println("�߰� ����");}
		
	}
	
	public void addAtZero() {
		sc.nextLine();
		System.out.println("****** ù ��ġ�� �� �߰� ******");
			System.out.print("�� ��:");
				String title=sc.nextLine();
			System.out.print("������ : ");
				String singer=sc.nextLine();
				Music m=new Music(title,singer);
			int succeess=mc.addAtZero(m);
		if(succeess==1){
			System.out.println("�߰� ����");
		}else{System.out.println("�߰� ����");}
		
	}
	
	public void printAll() {
		List list=mc.printAll();
		System.out.println("****** ��ü �� ��� ��� ******");
		System.out.println(list);
//			for(int i=0;i<list.size();i++) {
//				System.out.println(list.get(i));
//			}
		
	}
	
    public void searchMusic() {
    	sc.nextLine();
    	System.out.println("****** Ư�� �� �˻� ******");
    	System.out.print("�˻��� �� ��:");
    	String title=sc.nextLine();
    	Music m=mc.searchMusic(title);
		if(m==null) {
			System.out.println("�˻��� ���� �����ϴ�.");
		}else {
			System.out.println("�˻��� ���� "+m.getTitle()+","+m.getSinger()+"�Դϴ�.");
		}
	}
	
	public void removeMusic() {
		sc.nextLine();
		System.out.println("****** Ư�� �� ���� ******");
		System.out.print("������ �� ��:");
    	String title=sc.nextLine();
		Music m=mc.searchMusic(title);
    	if(m==null) {
    		System.out.println("������ ���� �����ϴ�.");
    	}else {
    		mc.removeMusic(title);
    		System.out.println(m.getTitle()+", "+m.getSinger()+"�� ���� �߽��ϴ�.");
    	}
    	
	}
	
	public void setMusic() {
		sc.nextLine();
		System.out.println("****** Ư�� �� ���� ���� ******");
			System.out.print("������ �� ��:");
	    	String title=sc.nextLine();
			Music m=mc.searchMusic(title);
				if(m==null) {
					System.out.println("������ ���� �����ϴ�.");
				}else {
					mc.setMusic(m.getTitle(),m);
					System.out.println(m.getTitle()+", "+m.getSinger()+"�� ���� ���� �Ǿ����ϴ�.");
					
				}
		
		
	}
	
	public void ascTitle() {
		sc.nextLine();
		System.out.println("****** �� �� �������� ���� ******");
		int success=mc.ascTitle();
			if(success==1) {
				System.out.println("���� ����");
			}else {   System.out.println("���� ����");}
		
	}
	
	public void descSinger() {
		sc.nextLine();
		System.out.println("****** ���� �� �������� ���� ******");
			int success=mc.descSinger();
				if(success==1) {
					System.out.println("���� ����");
				} else {  System.out.println("���� ����");}
	}
	
}

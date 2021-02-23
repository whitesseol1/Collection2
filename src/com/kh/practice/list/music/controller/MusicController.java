package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List list=new ArrayList();
	Scanner sc=new Scanner(System.in);
	
	public int addList(Music music) {
		list.add(music);
		
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0,music);
		return 1;
	}
	
	public List printAll() {
		
		return list;
	}
	
	public Music searchMusic(String title) {
		
		for(int i=0;i<list.size();i++) {
			if( ((Music)list.get(i)).getTitle().contains(title) ) {
				return ((Music)list.get(i));
			}
		}
		
		return null;
	}
	
public Music removeMusic(String title) {
	for(int i=0;i<list.size();i++) {
		if( ((Music)list.get(i)).getTitle().contains(title) ) {
			
			list.remove(i);
			return ((Music)list.get(i));
		}
	}
	
	
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		
		for(int i=0;i<list.size();i++) {
			if( ((Music)list.get(i)).getTitle().contains(title) ) {
				System.out.print("수정할 곡 명:");
				String setTitle=sc.nextLine();
				System.out.print("수정할 가수 명:");
				String setSinger=sc.nextLine();
				Music m=new Music(setTitle, setSinger);
				 list.set(i, m);
				
			}
		} 
		
		
		return null;
	}
	
	public int  ascTitle() {
		
	    Collections.sort(list);
		return 1;
	}
	
	public int descSinger() {
		
		Collections.sort(list, new AscTitle());
		return 1;
	}
	
}

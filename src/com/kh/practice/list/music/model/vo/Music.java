package com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class Music implements Comparable <Music>{
	
	private String title;
	private String singer;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getSinger() {
		return singer;
	}



	public void setSinger(String singer) {
		this.singer = singer;
	}
    
	public int hashCode() {
		
		return Objects.hash(title,singer);
	}
	
    public boolean equals(Object obj) {
    	if (obj instanceof Music) {
    		Music m=(Music)obj;
    		if(singer.equals(m.getSinger()) &&
    		title.equals(m.getTitle())	) {
    			return true;
    		}
    	}
    	
    	return false;
    }

	@Override
	public String toString() {
		return singer + "-" + title ;
	}



	@Override
	public int compareTo(Music o) {
		if(title.equals(o.title)  ) {
	      	  return singer.compareTo(o.singer);
	        } 
		return title.compareTo(o.title);
	}

}

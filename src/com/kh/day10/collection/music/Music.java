package com.kh.day10.collection.music;

public class Music {
	private String title;
	private String artist;
	
	public Music() {
		
	}
	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public void setTitle() {
		this.title = title;
	}
	
	public void setArtist() {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
	    return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
}

package com.samuel.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MusicList {
	@Id
	@GeneratedValue
	private int songId;
	
	private String songTitle;
	private double songDuration;
	private String artist;

	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getSongDuration() {
		return songDuration;
	}
	public void setSongDuration(double songDuration) {
		this.songDuration = songDuration;
	}
	@Override
	public String toString() {
		return "MusicList [songTitle=" + songTitle + ", duration=" + songDuration + "]";
	}
	
	
	
	
}

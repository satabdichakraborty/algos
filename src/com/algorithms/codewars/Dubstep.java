package com.algorithms.codewars;

public class Dubstep {
	
	public static void main(String[] args) {
		
		String song="WUBWEWUBWUBAREWUBTHEWUBWUBCHAMPIONSWUBMYWUBWUBFRIEND";		
		System.out.println(SongDecoder(song));
	}
	
	public static String SongDecoder(String song) {
		song = song.replaceAll("WUB", " ").replaceAll("\\s{2,}", " "). trim();
		return song;
	}
	
}

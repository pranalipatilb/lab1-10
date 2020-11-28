package com.capgemini.client.lab43;

import com.capgemini.service.lab43.CD;

public class Tester {

	public static void main(String[] args) {
		
//		Book book = new Book(1, "ABC", 12, "PQR");
//		book.print();
//		book.checkIn();
//		book.print();
		
//		JournalPaper jp = new JournalPaper(2, "JP", 44, "XYZ", 2001);
//		jp.print();
//		jp.checkOut();
//		jp.print();
		
//		Video video = new Video(100, "DJ", 2, 4, "Shukla", "Love", 1989);
//		video.print();
//		video.checkIn();
//		video.print();
	
		CD cd = new CD(101, "JK", 1, 9, "ABC", "Comedy");
		cd.print();
		cd.checkOut();
		cd.print();
		
	}

}

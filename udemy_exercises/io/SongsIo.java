package io;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import songs.Album;
import songs.Song;

public class SongsIo {

	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit");
		System.out.println("1 - to play next song");
		System.out.println("2 - to play previous song");
		System.out.println("3 - to replay the current song");
		System.out.println("4 - list songs in the playlist");
		System.out.println("5 - delete playlist");
		System.out.println("6 - print available actions");
	}
	
	// Below play method will be used in IO class for bonus
	public static void play(LinkedList<Song> playlist) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		ListIterator<Song> listIterator = playlist.listIterator();
		if (playlist.size() == 0) {
			System.out.println("No songs in playlist");
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
				case 0:
					quit = Album.stop();
					break;
				case 1:
					Album.nextSong(listIterator);
					break;
				
				case 2:
					Album.previousSong(listIterator);
					break;
					
				case 3:
					Album.repeatSong(listIterator);
					break;
				
				case 4:
					Album.showPlaylist(playlist);
					break;
				case 5: 
					Album.removePlaylist(playlist);
					break;

				case 6:
					printMenu();
					break;
					
				default:
					break;
			}
		}
		scanner.close();
	}

}

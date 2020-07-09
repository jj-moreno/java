package songs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

	private static boolean forward = true;
	private ArrayList<Song> songs;

	public Album() {
		this.songs = new ArrayList<Song>();
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			Song song = new Song(title, duration);
			this.songs.add(song);
			System.out.println("Song successfully added to album");
			return true;
		}
		System.out.println("Error! Song cannot be added to album. Song already exists.");
		return false;
	}

	private Song findSong(String title) {
		for (Song song : songs) {
			if (song.getTitle().equals(title)) {
				return song;
			}
		}
		return null;
	}

	public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
		Song foundSong = findSong(title);

		if (foundSong != null) {
			playlist.add(foundSong);
			System.out.println("Song successfully added.");
			return true;
		}
		System.out.println("Error! Song cannot be added to playlist. Song not in album.");
		return true;
	}
	
	public static boolean stop() {
		System.out.println("Playlist ended.");
		return true;
	}
	
	public static void nextSong(ListIterator<Song> listIterator) {
		if (!forward) {
			if (listIterator.hasNext()) {
				listIterator.next();
			}
			forward = true; 
		}
		if (listIterator.hasNext()) {
			System.out.println("Now playing " + listIterator.next());
		} else {
			System.out.println("We have reached the end of the playlist. Cannot go forward anymore.");
			forward = false;
		}
	}
	
	public static void previousSong(ListIterator<Song> listIterator) {
		if (forward) {
			if(listIterator.hasPrevious()) {
				listIterator.previous();
			}
			forward = false;
		}
		if (listIterator.hasPrevious()) {
			System.out.println("Now playing " + listIterator.previous());
		} else {
			System.out.println("We are at the start of the playlist. Cannot go back any further.");
			forward = true;
		}
	}
	
	public static void repeatSong(ListIterator<Song> listIterator) {
		if (forward) {
			if (listIterator.hasPrevious()) {
				System.out.println("Now replaying " + listIterator.previous());
				forward = false;
			} else {
				System.out.println("We are at the start of the playlist");
			}
		} else {
			if (listIterator.hasNext()) {
				System.out.println("Now replaying " + listIterator.next());
				forward = true;
			} else {
				System.out.println("We have reached the end of the playlist.");
			}
		}
	}
	
	public static void showPlaylist(LinkedList<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		System.out.println("==================================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("==================================");
	}
	
	public static void removePlaylist(LinkedList<Song> playlist) {
		int size = playlist.size();
		if (size > 0 ) {
			playlist.clear();
			System.out.println("Playlist deleted");
		} else {
			System.out.println("Error! No playlist initialized.");
		}
	}
}

/*
 ** Song Player w/ Java Classes** - **Album class** - Playlist of **Songs**. -
 * addPlayist() (songs must appear in the list in the order by which they were added) 
 * - stop() 
 * - nextSong() 
 * - previousSong() 
 * - repeatSong() 
 * - showPlaylist()
 * - removePlaylist() 
 * - **A song must exist in an album before it can be added
 * to the playlist (so you can only play songs that you own.)
 **
 */
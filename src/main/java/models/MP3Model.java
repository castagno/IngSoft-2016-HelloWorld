package main.java.models;

import java.io.File;
import java.util.ArrayList;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import main.java.views.BPMObserver;
import main.java.views.BeatObserver;

public class MP3Model implements MP3ModelInterface {
	private BasicPlayer player;
	private ArrayList<String> playlist;
	private ArrayList<BPMObserver> bpm_observers;
	private ArrayList<BeatObserver> beat_observers;
	private int index;
	private boolean paused;
	private boolean opened;
	private boolean stopped;
	
	public MP3Model(){
		player = new BasicPlayer();
		playlist = new ArrayList<String>();
		bpm_observers = new ArrayList<BPMObserver>();
		beat_observers = new ArrayList<BeatObserver>();
		index = 0;	
		stopped = true;		//stop comienza true
		paused = false;		//pausado comienza como false
		opened = false;		//ningun archivo abierto
	}

	@Override
	public void play() {
		if(playlist.size() == 0){
			return;
		}
		
		if(stopped){
			File f = new File(playlist.get(index));
			try {
				player.open(f);
			} catch (BasicPlayerException e) {
				e.printStackTrace();
			}
			opened = true;
			try {
				player.play();
			} catch (BasicPlayerException e) {
				e.printStackTrace();
			}
		}
		if(paused && opened){
			try {
				player.resume();
			} catch (BasicPlayerException e) {
				e.printStackTrace();
			}
			paused = false;

		}
	}

	@Override
	public void pause() {
		try {
			player.pause();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
		paused = true;
	}

	@Override
	public void setVolumen() {
		
	}

	@Override
	public void addPlayList(String Path) {
		File file = new File(Path);				// Uso la ruta para crear un nuevo File
		if (file.isFile()) { 					// Si la ruta es una sola cancion
			playlist.add(Path);
		} else { 								// Si la ruta es una carpeta con canciones
			File list[] = file.listFiles();
			if (list != null) {
				for (int i = 0; i < list.length; i++) {
					playlist.add(list[i].getAbsolutePath());
				}
			}
		}
	}

	@Override
	public void previousSong() {
		if(playlist.size() == 0)
			return;
			paused = false;
			stopped = true;
			index = (index-1)%playlist.size();
			try {
				player.play();
			} catch (BasicPlayerException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void nextSong() {
		if(playlist.size() == 0)
			return;
			paused = false;
			stopped = true;
			index = (index+1)%playlist.size();
			try {
				player.play();
			} catch (BasicPlayerException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void stop() {
		if(opened){
			try {
				player.stop();
			} catch (BasicPlayerException e) {
				e.printStackTrace();
			}
			stopped = true;
			paused = false;
		}
	}
}
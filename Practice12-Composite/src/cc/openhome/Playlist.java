package cc.openhome;

import java.util.*;

public class Playlist implements Playable {
	private List<Playable> list = new ArrayList<Playable>();
	public void add(Playable playable) {
		list.add(playable);	
	}
	@Override
	public void play() {
		for(Playable playable : list) {
			playable.play();
		}

	}

}

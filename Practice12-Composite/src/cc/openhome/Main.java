package cc.openhome;

public class Main {

	public static void main(String[] args) {
		Frame logo = new Frame("LOGO");
		
		Playlist playlist1 = new Playlist();
		playlist1.add(new Frame("Duke ������"));
		playlist1.add(new Frame("Duke �k����"));
		
		Playlist playlist2 = new Playlist();
		playlist2.add(new Frame("Duke �����}"));
		playlist2.add(new Frame("Duke ���k�}"));
		
		Playlist all = new Playlist();
		all.add(logo);
		all.add(playlist1);
		all.add(playlist2);
		
		all.play();
	}

}

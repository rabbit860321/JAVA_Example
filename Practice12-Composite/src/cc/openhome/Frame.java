package cc.openhome;

public class Frame implements Playable {
	private String image;
	Frame(String image){
		this.image = image;
	}
	@Override
	public void play() {
		System.out.println("¼½©ñ" + image);
	}

}

package cc.openhome;

class Clothes2{
	String color;
	char size;
	Clothes2(String color,char size){  //<-�غc��:�P���O�W�٦P�W����k
		this.color = color;
		this.size = size;
	}
}

public class Field2 {

	public static void main(String[] args) {
		Clothes2 sun = new Clothes2("blue",'M');
		Clothes2 spring = new Clothes2("red",'L');
		
		System.out.printf("sun (%s,%c)\n",sun.color,sun.size);
		System.out.printf("spring (%s,%c)\n",spring.color,spring.size);
	}

}

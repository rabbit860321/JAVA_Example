package cc.openhome;

class Ball{
	double radius;
	static final double PI = 3.14159;  //被宣告為static的屬性 不會讓個別物件擁有 而是屬於類別
	static double toRadiane(double angdeg) {
		return angdeg * (Ball.PI / 180);
	}
}

public class Static {

	public static void main(String[] args) {
		Ball b1 = new Ball();
		b1.radius = 5;
		System.out.println(b1.radius + " " + Ball.PI);
		System.out.println(Ball.toRadiane(100));
	}

}

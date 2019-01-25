package cc.openhome;

public class Car extends Vehicle {
	int y;
	 
    Car() {
        super();
        //this(20); // line n2
    }
 
    Car(int y) {
        this.y = y;
    }
 
    public String toString() {
        return super.x + ":" + this.y;
    }
}

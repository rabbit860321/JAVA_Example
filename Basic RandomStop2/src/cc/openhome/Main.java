package cc.openhome;

public class Main {
    public static void main(String[] args) {
        int number;
        do{
            number = (int)(Math.random()*10);
            System.out.println(number);
        }while(number != 5);
        System.out.println("I hit 5...0rz");
    }
    
}

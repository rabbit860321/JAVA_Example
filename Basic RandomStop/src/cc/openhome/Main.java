package cc.openhome;

public class Main {
    public static void main(String[] args) {
        while(true){
            int number = (int)(Math.random()*10);
            System.out.println(number);
            if(number == 5){
                System.out.println("I hit 5...0rz");
                break;
            }
        }
    }
}

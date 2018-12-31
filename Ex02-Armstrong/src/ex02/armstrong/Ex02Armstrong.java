package ex02.armstrong;

public class Ex02Armstrong {

    public static void main(String[] args) {
        int a,b,c;
        for(int i = 100;i<=999;i++){
            a = i/100;  //取百位數
            b = (i % 100) / 10;  //取十位數
            c = i%10;  //取個位數
            if((a*a*a)+(b*b*b)+(c*c*c) == i){
                System.out.println(i);
            }
        }
    }
}

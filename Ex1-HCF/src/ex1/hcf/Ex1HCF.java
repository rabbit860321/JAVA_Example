package ex1.hcf;

public class Ex1HCF {
    public static void main(String[] args) {
        int m = 1000;
        int n = 495;
        int gcd = 0;
        
        for(int i =1;i<=495;i++){
            if(m%i==0 && n%i==0)
            {
                gcd = i;
            }
        }
        System.out.println("gcd="+gcd);
    } 
}

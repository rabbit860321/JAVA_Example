package cc.openhome;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%d ~ %d%n",Byte.MIN_VALUE,Byte.MAX_VALUE);           //Byte範圍
        System.out.printf("%d ~ %d%n",Short.MIN_VALUE,Short.MAX_VALUE);         //Short範圍
        System.out.printf("%d ~ %d%n",Integer.MIN_VALUE,Integer.MAX_VALUE);     //Integer範圍
        System.out.printf("%d ~ %d%n",Long.MIN_VALUE,Long.MAX_VALUE);           //Long範圍
        
        System.out.printf("%d ~ %d%n",Float.MIN_EXPONENT,Float.MAX_EXPONENT);   //Float精度範圍
        System.out.printf("%d ~ %d%n",Double.MIN_EXPONENT,Double.MAX_EXPONENT); //Double精度範圍
        
        System.out.printf("%h ~ %h%n",Character.MIN_VALUE,Character.MAX_VALUE);  //Char可表示的Unicode範圍
        
        System.out.printf("%b ~ %b%n",Boolean.TRUE,Boolean.FALSE);                 //Boolean的兩個值
        
    }
    
}

import java.util.Scanner;

public class shuixianhua {
    public static void main(String[] args){

     int n=100;
     int a,b,c;
     while(n<1000){
         a=n/100;
         b=(n/10)%10;
         c=n%10;
         if(n==a*a*a+b*b*b+c*c*c){
             System.out.print(n+" ");
         }
         n++;
     }

    }
}

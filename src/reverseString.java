import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        String s=sca.next();
        char[] a=s.toCharArray();
        char t;
        int i=a.length-1;
        int j=0;
        for(;i>j;i--,j++){
            //for(int j=0;j<a.length/2;j++){
              t=a[j];
              a[j]=a[i];
              a[i]=t;
            //}
        }
        String s1=String.valueOf(a);
        System.out.print(s1);
    }
}

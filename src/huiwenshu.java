import java.util.Scanner;

public class huiwenshu {
    public static void main(String[] args){
        boolean flag=true;


        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        String s=String.valueOf(n);
        char[] a=s.toCharArray();
        char t;
        int i=a.length-1;
        int j=0;
        if(flag) {
            for (; i > j; i--, j++) {
               if(a[i]!=a[j]){
                   flag=false;
               }
            }
        }

        if(flag){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}

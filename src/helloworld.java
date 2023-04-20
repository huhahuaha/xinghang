import java.util.Scanner;

public class helloworld {
    public static void main(String[] args){
        System.out.println("1.A  2.B  3.D  4.B  5.D");
        System.out.println("-----------------");
        ShowTriangle(4);
        System.out.println("-----------------");
        reverseString("adxc45");
        System.out.println("-----------------");
        huiwenshu(121);
        System.out.println("-----------------");
        shuixianhua();
        System.out.println("-----------------");
        arraysDemo();
    }

    public static void ShowTriangle(int n){
        //Scanner sca=new Scanner(System.in);
        //int n=sca.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=n-i-1;k<=n+i-1;k++){
                System.out.print("*");
            }
            for(int l=2*n-1;l>n+i-1;l--){
                System.out.println(" ");
            }
        }
    }



    public static void reverseString(String s){
        //Scanner sca=new Scanner(System.in);
        //String s=sca.next();
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
        System.out.println(s1);
    }

    public static void huiwenshu(int n){
        boolean flag=true;


        //Scanner sca=new Scanner(System.in);
        //int n=sca.nextInt();
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
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

    public static void shuixianhua(){
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
        System.out.println();
    }

    public static void arraysDemo(){
        int[] a=new int[]{11,12,4,5,8,6,445,55,66,77};
        int n=a.length;
        int min=a[0];
        int max=a[n-1];
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.print(max+min);
    }


}

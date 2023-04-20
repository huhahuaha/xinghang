import java.util.Scanner;

public class showTriangle{
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
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
}
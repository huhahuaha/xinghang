public class arraysDemo {
    public static void main(String[] arys){
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

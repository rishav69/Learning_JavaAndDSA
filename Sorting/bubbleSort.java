import java.util.Scanner;

public class bubbleSort {
    public static int[] bubble(int[] a,int n){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Sorted elements are:");
        int[] b=bubble(a, n);
        for(int i=0;i<n;i++){
            System.out.print(b[i]+"  ");
        }
        s.close();
    }
}

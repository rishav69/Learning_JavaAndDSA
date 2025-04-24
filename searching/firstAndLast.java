import java.util.Scanner;

public class firstAndLast {
    static int[] search(int[] a,int tar){
        int n=a.length-1;
        int[] ans={-1,-1};
        for(int i=0;i<=n;i++){
            if(a[i]==tar){
                ans[0]=i;
            }
        }
        for(int i=n;i>=0;i--){
            if(a[i]==tar){
                ans[1]=i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] arr={1,2,33,4,4,33,4,6,3,2,1,2,43};
        System.out.println(search(arr, t));
        s.close();
    }
}

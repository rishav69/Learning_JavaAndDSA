import java.util.Scanner;

public class recursionTillN {
    static int i=0;
    public static void rec(int n){
        if (i>=n)return ;
        i++;
        System.out.print(i+" ");
        rec(n);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=s.nextInt();
        rec(n);
        s.close();
    }
}

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a numbre to check if it is prime:");
        int n=s.nextInt();
        int q=0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                q++;
            }
        }
        if(q<=2){
                System.out.println("prime number");
        }
        else{
            System.out.println("Not prime");
        }
        s.close();
    }
}

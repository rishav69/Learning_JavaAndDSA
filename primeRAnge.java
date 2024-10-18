import java.util.*;

public class primeRAnge {
    public static void main(String[] args) {
        System.out.print("Enter two numbers to get all prime numbers between them:");
        Scanner s=new Scanner(System.in);
        int f=s.nextInt(),n=s.nextInt();
        for(int i=f;i<=n;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c++;
            }
            while(c==2){
                    System.out.print(i+" ");
                    break;
                }
        }
        s.close();
    }
}

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter two numberes:");
        int a=s.nextInt(),b=s.nextInt();
        //int b=s.nextInt();
        //int c=a+b;
        System.out.println((a)+"+"+(b)+"=" + (a+b));
        s.close();
    }
}
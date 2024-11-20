import java.util.Scanner;

public class binarySearch {
    static int search(int arr[],int tar){
        int s,e;
        s=0;
        e=arr.length-1;
        boolean ass=arr[0]<arr[e];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(ass){
                if(arr[mid]>tar){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                if(arr[mid]<tar){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int[] a={1,3,6,17,88,97,99};
        int[] a={99,97,88,17,6,3,1};
        System.out.println("Enter target number");
        int n=sc.nextInt();
        System.err.println("index of "+ n +" = "+ search(a, n));
        sc.close();
    }
}

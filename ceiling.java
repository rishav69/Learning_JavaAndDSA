import java.util.Scanner;

public class ceiling {
    static int ceil(int a[], int n) {
        int s = 0, e;
        e = a.length - 1;
        boolean assend=a[0]<=a[e];
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == n) {
                return mid;
            } 
            if (assend) {
                if (a[mid] > n) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            else{
                if (a[mid] < n) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return s;                      /*              same code for floor but will return e                 */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 3, 8, 13, 19, 22, 32, 39, 41, 50, 67, 77, 81, 82, 88, 89, 90, 99 };
        System.out.println("Enter a number to get the ceiling value:");
        int x = sc.nextInt();
        int ind=ceil(arr, x);
        System.out.println("ceilling value is = " + arr[ind]);
        sc.close();
    }
}
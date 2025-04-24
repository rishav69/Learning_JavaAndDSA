import java.util.*;

public class Hash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter" + n + "elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("Enter number of elements to find frequency: ");
        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            System.out.print("Enter element: ");
            number = sc.nextInt();
            // fetching:
            System.out.print("Frequency of "+number+ " = ");
            System.out.println(hash[number]);
        }
        sc.close();
    }    
}


// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < n; i++) {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }
        
//         n = n / 2;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > n) {
//                 return entry.getKey();
//             }
//         }
        
//         return 0;
//     }
// }

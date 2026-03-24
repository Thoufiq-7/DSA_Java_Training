import java.util.*;
import java.util.Scanner;
public class SignArray {
    public static int arraySign(int[] nums) {
        int sign=1;
        int neg=0;
        for(int i:nums){
            if(i==0) return 0;
            if(i<0) neg++;
        }
        if(neg%2!=0) sign=-sign;
        return sign;
    }
    public static void main(String[] argas){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arraySign(arr));
    }
}

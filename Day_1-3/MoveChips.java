import java.util.*;
import java.util.Scanner;
public class MoveChips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[i] = sc.nextInt();
        }
        int evenCnt = 0, oddCnt = 0;

        for (int i : pos) {
            if (i % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }
        System.out.println(Math.min(evenCnt, oddCnt));
    }
}